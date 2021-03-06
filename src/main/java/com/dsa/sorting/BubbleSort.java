package com.dsa.sorting;

public class BubbleSort{

    public static void demo(){
        int inputArr[] = {3, 2, 1, 78, 4, 5, 9, 10, 32, 23, 23};
        printArray(inputArr);

        sort(inputArr);

        printArray(inputArr);
        

    }


    // Sorting in ascending order
    public static int[] sort(int arrayToSort[]){

        boolean swapHappenedInThePass = true;

        for(int pass = 0; pass < (arrayToSort.length - 1) && swapHappenedInThePass; pass++){
            swapHappenedInThePass = false;
            for(int j = 0; j < arrayToSort.length - 1 - pass; j++){
                if(arrayToSort[j] > arrayToSort[j+1]){
                    //swap
                    int temp = arrayToSort[j+1];
                    arrayToSort[j+1] = arrayToSort[j];
                    arrayToSort[j] = temp;
                    swapHappenedInThePass = true;
                }

                
            }
        }
        
        return arrayToSort;
    }

    static void printArray(int arrayToPrint[]){

        System.out.print("| ");

        for(int element : arrayToPrint){
            System.out.print(element + " | ");
        }
        System.out.println();

    }

}