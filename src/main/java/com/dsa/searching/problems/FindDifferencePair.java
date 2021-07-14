/**
 * In an array of positive integers, 
 * Find a pair whose absolute value of difference is equal to a given value.
 */
package com.dsa.searching.problems;

import java.util.Arrays;

public class FindDifferencePair {
    
    /**
     * 
     * @param input
     * @param target
     * @return For simplicity, we will return the smaller number
     */
    public static int findDifferencePair(int input[], int target){
        Arrays.sort(input);

        int ptr1 = 0;
        int ptr2 = 1;

        int diff = input[ptr2] - input[ptr1];
        while(diff != target){
            if(diff < target){
                ptr2++;
            }else{
                ptr1++;
            }
            if(ptr1 >= input.length || ptr2 >= input.length){
                return -1;
            }
            diff = input[ptr2] - input[ptr1];
        }

        return input[ptr1];
    }
}
