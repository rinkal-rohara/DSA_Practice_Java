/**
 * In given list of integers, both positive and negative. 
 * You need to find the two elements such that their sum is closest to zero.
 */
package com.dsa.searching.problems;

import java.util.Arrays;

public class SumClosestToZero {

    public static String findElementsWithSumClosestTo0(int input[]){

        Arrays.sort(input);

        int minAbsSum = Math.abs(2 * input[input.length - 1]) ;
        int ele1Ptr = input.length - 1;
        int ele2Ptr = input.length - 1;

        int leftPtr = 0;
        int rightPtr = input.length - 1;

        while(leftPtr < rightPtr){
            int currentSum = input[leftPtr] + input[rightPtr];

            if(currentSum == 0){
                ele1Ptr = leftPtr;
                ele2Ptr = rightPtr; 
                minAbsSum = currentSum;
                break;
            }

            int currentAbsSum = Math.abs(currentSum);
            if(currentAbsSum < minAbsSum){
                ele1Ptr = leftPtr;
                ele2Ptr = rightPtr; 
                minAbsSum = currentAbsSum;
            }
            if(currentSum < 0){
                leftPtr++;
            }else if(currentSum > 0){
                rightPtr--;
            }

        }

        return input[ele1Ptr] + ", " + input[ele2Ptr];
    }
    
}
