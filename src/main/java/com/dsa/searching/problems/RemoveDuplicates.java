/**
 * Remove duplicates in a given integer array
 */
package com.dsa.searching.problems;

import java.util.Arrays;

public class RemoveDuplicates {
    
    public static int[] removeDuplicates(int input[]){
        int endIdxOfFinalArray = -1;


        Arrays.sort(input);

        // bring unique elements to the left, don't worry about duplicates

        for(int i = 0; i < input.length; i++){

            boolean isUnique = false;
            if(i == 0){// first element
                isUnique = input[i] != input[i+1];
            }else if(i == input.length - 1){ //last element
                isUnique = input[i] != input[i-1];
            }else{ // remaining elements
                isUnique = input[i] != input[i+1] && input[i-1] != input[i];
            }

            if(isUnique){
                endIdxOfFinalArray++;
                input[endIdxOfFinalArray] = input[i];
            }
        }

        return Arrays.copyOf(input, endIdxOfFinalArray + 1);

    }
}
