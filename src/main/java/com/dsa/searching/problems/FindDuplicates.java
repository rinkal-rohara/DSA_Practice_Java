/*Given an array of n number, find all the duplicate elements in the array */
package com.dsa.searching.problems;

import java.util.Arrays;

public class FindDuplicates {
    
    public static int[] findDuplicates(int input[]){
        int result[] = new int[input.length];
        int resPtr = 0;

        Arrays.sort(input);

        Integer lastDupElement = null;

        for(int i = 1; i < input.length; i++){
            if(input[i] == input[i-1] && (lastDupElement == null || input[i] != lastDupElement)){
                result[resPtr] = input[i];
                resPtr++;
                lastDupElement = input[i];
            }
        }
        int finalResult[] = new int[resPtr];
        for(int i = 0; i < resPtr; i++){
            finalResult[i] = result[i];
        }

        return finalResult;
    }
}
