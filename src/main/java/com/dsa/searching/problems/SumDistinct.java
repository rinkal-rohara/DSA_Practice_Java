/**
 * Given an array of size N, the elements in the array may be repeated. 
 * You need to find sum of distinct elements of the array.
 * If there is some value repeated continuously then they should be added only once.
 */
package com.dsa.searching.problems;

import java.util.Arrays;

public class SumDistinct {

    public static int findSumOfDistinctElements(int input[]){
        Arrays.sort(input);


        int sum = 0;
        for(int i = 0; i < input.length - 1; i++){
            if(input[i] != input[i+1]){
                sum += input[i];
            }
        }
        sum += input[input.length - 1];

        return sum;
    }
    
}
