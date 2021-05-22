package com.dsa.sorting;

public class BubbleSort{

    public static void main(String args[]){
        int inputArr[] = {2, 3, 1, 78, 4, 5, 9, 10, 32, 23, 23};
        printArray(inputArr);

        sort(inputArr);

        printArray(inputArr);
        

    }


    // Sorting in ascending order
    static void sort(int arrayToSort[]){

        boolean swapHappenedInThePass = true;

        for(int pass = 0; pass < (arrayToSort.length - 1) && swapHappenedInThePass; pass++){
            swapHappenedInThePass = false;
            for(int j = pass; j < arrayToSort.length - 1; j++){
                if(arrayToSort[j] > arrayToSort[j+1]){
                    //swap
                    int temp = arrayToSort[j+1];
                    arrayToSort[j+1] = arrayToSort[j];
                    arrayToSort[j] = temp;
                    swapHappenedInThePass = true;
                }

                
            }
        }
        
        return;
    }

    static void printArray(int arrayToPrint[]){

        System.out.print("| ");

        for(int element : arrayToPrint){
            System.out.print(element + " | ");
        }
        System.out.println();

    }

}