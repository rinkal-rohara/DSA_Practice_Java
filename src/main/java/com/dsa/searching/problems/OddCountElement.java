/**
 * Given an array in which all the elements appear even number of times except one,
 * which appear odd number of times.
 * Find the element which appear odd number of times.
 */
package com.dsa.searching.problems;

public class OddCountElement {
    
    public static int findElementWithOddCount(int input[]){

        if(input.length == 0){
            return -1;
        }
        int xor = input[0];

        for(int i = 1; i < input.length; i++){
            xor ^= input[i];
        }

        return xor;
    }
}
