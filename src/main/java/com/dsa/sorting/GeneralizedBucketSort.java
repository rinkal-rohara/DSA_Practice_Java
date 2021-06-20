package com.dsa.sorting;

import java.util.ArrayList;

public class GeneralizedBucketSort{

    public static void demo(){


        int inputArr[] = {0, 5, 55, 4, 34, 6, 67, 6, 76, 7, 4, 2, 0, 9, 8};
        printArray(inputArr);

        sort(inputArr);

        printArray(inputArr);
        

    }

    static void addWithInsertionSort(ArrayList<Integer> list, int numToAdd){
        int listSize = list.size();
        for(int i = 0; i < listSize; i++){
            int num = list.get(i);
            if(num > numToAdd){
                list.add(i, numToAdd);
                return;
            }
        }
        list.add(numToAdd);
    }

    // Sorting in ascending order
    static void sort(int arrayToSort[]){

        // algo to sort an array of numbers ranging from 0 to 99
        ArrayList<Integer> bucketArr[] = new ArrayList[10];

        for(int i = 0; i < arrayToSort.length; i++){

            int bucketIndex = arrayToSort[i] / 10;
            if(bucketArr[bucketIndex] == null){
                bucketArr[bucketIndex] = new ArrayList<Integer>();
            }
            addWithInsertionSort(bucketArr[bucketIndex], arrayToSort[i]);
            
        }


        //re populating input array with sorted values
        for(int i = 0, j = 0; i < bucketArr.length; i++){
            if(bucketArr[i] == null){
                continue;
            }
            for(int k: bucketArr[i]){
                arrayToSort[j] = k;
                j++;
            }
        }

    }

    static void printArray(int arrayToPrint[]){

        System.out.print("| ");

        for(int element : arrayToPrint){
            System.out.print(element + " | ");
        }
        System.out.println();

    }
}
