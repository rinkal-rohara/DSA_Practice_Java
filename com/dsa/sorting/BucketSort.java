package com.dsa.sorting;

public class BucketSort{

    public static void main(String args[]){


        int inputArr[] = {0, 5, 5, 4, 3, 6, 6, 6, 6, 7, 4, 2, 0, 9, 8};
        printArray(inputArr);

        sort(inputArr);

        printArray(inputArr);
        

    }


    // Sorting in ascending order
    static void sort(int arrayToSort[]){

        // algo to sort an array of single digit numbers
        int bucketArr[] = new int[10];

        for(int i = 0; i < arrayToSort.length; i++){
            ++bucketArr[arrayToSort[i]];
        }

        for(int i = 0, j = 0; i < bucketArr.length; i++){
            for(int k = 0; k < bucketArr[i]; k++){
                arrayToSort[j] = i;
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
