/*
Given an unsorted list of n elements, find the first element, which is repeated.
Return -1 otherwise.
*/
package com.dsa.searching.problems;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedElement {

    public static int findFirstRepeatedElement(int inputArr[]){

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int num : inputArr){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
        }


        for(int num: inputArr){
            int count = map.get(num);
            if(count > 1){
                return num;
            }
        }
        return -1;
    }
    
}
