package com.dsa.sorting;

public class QuickSort{

    public static void demo(){
        //int inputArr[] = {2, 3, 1, 78, 4, 5, 9, 10, 32, 23, 23};
        //int inputArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int inputArr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        printArray(inputArr);

        sort(inputArr, 0, inputArr.length - 1);

        printArray(inputArr);
        

    }


    // Sorting in ascending order
    static void sort(int arrayToSort[], int startIndex, int endIndex){

        if(endIndex <= startIndex){
            return;
        }

        //select first element as the sub-arrays separator. Christen it as 'peeku'
        int peekuIndex = startIndex;
        int peeku = arrayToSort[peekuIndex];
        //goal = to move all less or equal elements to the left


        for(int i = startIndex; i <= endIndex; i++){
            if(i == peekuIndex){
                continue;
            }
            if(arrayToSort[i] <= peeku){
            /* Wheenver an element smaller than peeku is found, 
            make space for it towards the left and move it there */

                int temp = arrayToSort[i];
                arrayToSort[ i ] = arrayToSort[peekuIndex+1];
                arrayToSort[ peekuIndex + 1 ] = arrayToSort[peekuIndex];
                arrayToSort[ peekuIndex ] = temp;
                
                peekuIndex = peekuIndex + 1;

            }

        }


        sort(arrayToSort, startIndex, peekuIndex - 1);
        sort(arrayToSort, peekuIndex + 1, endIndex);
    }

    static void printArray(int arrayToPrint[]){

        System.out.print("| ");

        for(int element : arrayToPrint){
            System.out.print(element + " | ");
        }
        System.out.println();

    }

}