package com.dsa.sorting;

public class SelectionSort{

    public static void main(String args[]){
        int inputArr[] = {2, 3, 1, 78, 4, 5, 9, 10, 32, 23, 23};
        printArray(inputArr);

        sort(inputArr);

        printArray(inputArr);
        

    }


    // Sorting in ascending order
    static void sort(int arrayToSort[]){

        //loop
        // find min number
        // swap it with the number at loop counter


        for(int counter = 0; counter < arrayToSort.length - 1; counter++){
            int minIndex = counter;
            for(int innerCounter = counter + 1; innerCounter < arrayToSort.length; innerCounter++){
                if(arrayToSort[minIndex] > arrayToSort[innerCounter]){
                    minIndex = innerCounter;
                }
            }

            int temp = arrayToSort[counter];
            arrayToSort[counter] = arrayToSort[minIndex];
            arrayToSort[minIndex] = temp;
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