/* 
Given an array of positive elements. You need to perform reduction operation. 
In each reduction operation smallest positive element value is picked and all the elements are substracted by that value.
You need to print the number of elements left after each reduction process.*/
package com.dsa.sorting.problems;
import java.util.Arrays;

public class ArrayReduction {
    public static void demo(){
        int inputArr[] = {5, 1, 1, 1, 2, 3, 5};
        // expected output: 4 3 2 0
        reduceAndPrint(inputArr);
    }

    private static void reduceAndPrint(int[] inputArr){
        Arrays.sort(inputArr);

        int reducer = inputArr[0];
        for(int i = 0; i < inputArr.length; i++){
            if(inputArr[i] - reducer > 0){
                System.out.println(inputArr.length - i);
                reducer = inputArr[i];
            }
        }
    }

}