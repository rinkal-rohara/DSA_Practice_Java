package com.dsa.searching.problems;

import java.util.HashSet;

public class FindMissingValues {
    
    public static HashSet<Integer> findMissingValues(int input[]){
        HashSet<Integer> set = new HashSet<Integer>();

        if(input.length == 0){
            return set;
        }
        int max = input[0];
        int min = input[0];

        for(int i = 0; i < input.length; i++){
            if(input[i] > max){
                max = input[i];
            }
            if(input[i] < min){
                min = input[i];
            }
            set.add(input[i]);
        }

        HashSet<Integer> missingValues = new HashSet<Integer>();


        for(int i = min; i <= max; i++){
            if(!set.contains(i)){
                missingValues.add(i);
            }
        }

        return missingValues;

    }
}
