package com.dsa.searching;


public class LinearSearchSorted{

    public static int search(int inputArr[], int target){

        for(int i = 0; i < inputArr.length; i++){
            if(inputArr[i] > target){
                return -1;
            }else if(inputArr[i] == target){
                return i;
            }
        }
        return -1;
    }
}