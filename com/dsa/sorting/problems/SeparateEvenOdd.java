/* Given an array of even and odd numbers, write a program to separate even numbers from the odd numbers */
package com.dsa.sorting.problems;

public class SeparateEvenOdd {

    public static void main(String args[]){
        int inputArr[] = {5, 8, 6, 2, 55, 89, 6666, 4548, 1, 0, 3, 78, 79};
        printArray(inputArr);

        sort(inputArr);

        printArray(inputArr);
        

    }


    // Sorting in ascending order
    static void sort(int arrayToSort[]){

        int leftIndex = 0;
        int rightIndex = arrayToSort.length - 1;

        while(leftIndex < rightIndex){
            if(arrayToSort[leftIndex] % 2 == 1 && arrayToSort[rightIndex] % 2== 0){
                //swap; can substitute 0 and 1 directly as well instead of swapping
                int temp = arrayToSort[leftIndex];
                arrayToSort[leftIndex] = arrayToSort[rightIndex];
                arrayToSort[rightIndex] = temp;

                leftIndex++;
                rightIndex--;
                continue;
            }
            if(arrayToSort[leftIndex] % 2 == 0){
                leftIndex++;
            }
            if(arrayToSort[rightIndex] % 2== 1){
                rightIndex--;
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
