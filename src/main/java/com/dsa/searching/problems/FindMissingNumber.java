/**
 * In given list of n-1 elements, which are in the range of 1 to n. 
 * There are no duplicates in the array. One of the integer is missing.
 * Find the missing element.
 */

package com.dsa.searching.problems;

public class FindMissingNumber {
    


    public static int findMissingNumber(int input[], int lowerBound, int upperBound){

        int expectedSum = (upperBound - lowerBound + 1)*(lowerBound + upperBound)/2;


        int actualSum = 0;
        for(int i = 0; i < input.length; i++){
            actualSum += input[i];
        }

        return expectedSum - actualSum;
    }
}
