package com.dsa.searching;
public class BinarySearch {
    
    public static int search(int inputArr[], int target){

        int leftIndex = 0;
        int rightIndex = inputArr.length - 1;
        
        if(target < inputArr[leftIndex] || target > inputArr[rightIndex]){
            return -1;
        }
        if(target == inputArr[leftIndex]){
            return leftIndex;
        }
        if(target == inputArr[rightIndex]){
            return rightIndex;
        }


        while(leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;

            if(inputArr[midIndex] == target){
                return midIndex;
            }else if(target < inputArr[midIndex]){
                rightIndex = midIndex - 1;
            }else{
                leftIndex = midIndex + 1;
            }
        }

        return -1;
    }
}
