/**
 * Given an array of integers, find if reversing a sub-array makes the array sorted.
 * 
 */
package com.dsa.sorting.problems;

public class CheckReverse {
    
    public static void demo(){
        int inputArr[] = {1, 2, 3, 4, 5, 6, 9, 8, 7, 7, 5};

        boolean result = checkReverse(inputArr);

        System.out.println(result);
    }


    public static boolean checkReverse(int inputArr[]){

        int leftPtr = 0;
        int rightPtr = inputArr.length - 1;
        int i = 0;
        for(; i < inputArr.length - 1; i++){
            if(inputArr[i] > inputArr[i+1]){
                leftPtr = i;
                break;
            }
        }

        while(i < inputArr.length - 1){
            if(inputArr[i] < inputArr[i+1]){
                rightPtr = i;
                break;
            }
            i++;
        }

        while(i < inputArr.length - 1){
            if(inputArr[i] > inputArr[i+1]){
                return false;
            }
            i++;
        }


        if(leftPtr == 0 && rightPtr == inputArr.length - 1){
            return true;
        }
        if(leftPtr == 0){
            return inputArr[leftPtr] <= inputArr[rightPtr + 1];
        }
        if(rightPtr == inputArr.length - 1){
            return inputArr[leftPtr - 1] <= inputArr[rightPtr];
        }

        return inputArr[leftPtr] < inputArr[rightPtr + 1] && inputArr[leftPtr - 1] <= inputArr[rightPtr];
    }
}
