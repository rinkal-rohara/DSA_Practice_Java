/* Given two array, sort first array according to the order defined in the second array */
package com.dsa.sorting.problems;

import java.util.HashMap;

public class SortByOrder {

    public static void main(String args[]) {
        int inputArr[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
        int orderArr[] = {2, 1, 8, 3};

        //Expected output: 2, 2, 1, 1, 8, 8, 3, 5, 7, 9, 6
        printArray(inputArr);

        sortAndPrint(inputArr, orderArr);

    }

    // Sorting in ascending order
    static void sortAndPrint(int arrayToSort[], int orderArr[]) {

        //Creating freq hashmap
        HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < arrayToSort.length; i++){
            if(freqMap.containsKey(arrayToSort[i])){
                int freq = freqMap.get(arrayToSort[i]);
                freqMap.put(arrayToSort[i], freq + 1);
            }else{
                freqMap.put(arrayToSort[i],  1);
            }
        }

        System.out.print("| ");
        // printing the elements in the order array
        for(int i = 0; i < orderArr.length; i++){
            int freq = 0;
            if(freqMap.containsKey(orderArr[i])){
                freq = freqMap.get(orderArr[i]);
                freqMap.remove(orderArr[i]);
            }
            for(int j = 0; j < freq; j++){
                System.out.print(orderArr[i] + " | ");
            }

        }

        //printing rest of the elements
        for(int i = 0; i < arrayToSort.length; i++){
            int freq = 0;
            if(freqMap.containsKey(arrayToSort[i])){
                freq = freqMap.get(arrayToSort[i]);
                freqMap.remove(arrayToSort[i]);
            }
            for(int j = 0; j < freq; j++){
                System.out.print(arrayToSort[i] + " | ");
            }

        }

    }

    static void printArray(int arrayToPrint[]) {

        System.out.print("| ");

        for (int element : arrayToPrint) {
            System.out.print(element + " | ");
        }
        System.out.println();

    }

}
