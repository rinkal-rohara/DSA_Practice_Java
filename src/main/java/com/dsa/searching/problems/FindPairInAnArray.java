/**
 * Given an array of n numbers, find two elements such that their sum is equal to "value".
 */
package com.dsa.searching.problems;

import java.util.Arrays;

public class FindPairInAnArray {

    /**
     * For simplicity, this method will only return the smaller number in the pair.
     * If no such pair exists, then returns -1
     */
    public static int findPair(int input[], int target) {

        Arrays.sort(input);
        int leftPtr = 0;
        int rightPtr = input.length - 1;

        while (leftPtr < rightPtr) {
            int currentSum = input[leftPtr] + input[rightPtr];
            if (target == currentSum) {
                return input[leftPtr];
            }
            if (target < currentSum) {
                rightPtr--;
            } else {
                leftPtr++;
            }
        }

        return -1;

    }
}
