package com.dsa.searching;

public class LinearSearchUnsorted {


    public static int search(int inputArr[], int target){


        for(int i = 0; i < inputArr.length; i++){
            if(inputArr[i] == target){
                return i;
            }
        }

        return -1;
    }
    
}
