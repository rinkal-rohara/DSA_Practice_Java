/**
 * This is the actual Quick Select algorithm. 
 * Given an unsorted array and an index, It returns the expected value at the index if array was sorted.  
 * */
package com.dsa.sorting.problems;

public class QuickSelectForValue {

    private static boolean gt(String str1, String str2){
        return str1.compareTo(str2) > 0;
    }
    
    private static String findValueAtIndex(String[] inputArr, int targetIndex, int start, int end){

        // take first element, find index(bring small ele to left and large ele to right)
        // if index == targetIndex, return the element
        // if index < targetIndex, then repeat for right side
        // else repeat for left side

        if(start > end){
            return null;
        }
        if(start == end && start == targetIndex){
            return inputArr[start];
        }

        int pinkuIndex = start;
        String pinku = inputArr[pinkuIndex];

        for(int i = pinkuIndex + 1; i <= end; i++){
            if(gt(pinku, inputArr[i])){
                String temp = inputArr[i];
                inputArr[i] = inputArr[pinkuIndex + 1];
                inputArr[pinkuIndex + 1] = pinku;
                inputArr[pinkuIndex] = temp;
                pinkuIndex++;
            }
        }
        if(pinkuIndex == targetIndex){
            return pinku;
        }else if(pinkuIndex < targetIndex){
            return findValueAtIndex(inputArr, targetIndex, pinkuIndex + 1, end);
        }else{
            return findValueAtIndex(inputArr, targetIndex, start, pinkuIndex - 1);
        }
    }

    public static String findValueAtIndex(String[] inputArr, int targetIndex){
        if(inputArr.length == 0 || inputArr.length <= targetIndex || targetIndex < 0){
            return null;
        }

        int start = 0;
        int end = inputArr.length - 1;
        return findValueAtIndex(inputArr, targetIndex, start, end);
    }
}
