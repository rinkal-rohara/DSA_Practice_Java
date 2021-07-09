/**
 * Given an array in which all the elements appear even number of times except two,
 * which appear odd number of times. Find the elements which appear odd number of times
 * in O(n) time complexity and O(1) space complexity.
 * Returns sum of the 2 numbers, for simplicity.
 */
package com.dsa.searching.problems;


public class OddCountElements {
    

    public static int findElementsWithOddFrequency(int input[]){
        int xorSum = 0;
        for(int i = 0; i < input.length; i++){
            xorSum ^= input[i];
        }

        int rightmostSetBit = xorSum & ~(xorSum - 1);

        int first = 0;
        int second = 0;


        for(int i = 0; i < input.length; i++){
            if((input[i] & rightmostSetBit) == 0){
                first ^= input[i];
            }else{
                second ^= input[i];
            }
        }

        System.out.println(first + ", " + second);
        return first + second;
    }
}
