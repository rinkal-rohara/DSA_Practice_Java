/* 
    Given an array containing 0s and 1s. Write an algorithm to sort array so that 0s come first followed by 1s. 
    Also find the minimum number of swaps required to sort the array.
*/
package com.dsa.sorting.problems;

public class Partition01{

    public static void main(String args[]){
        int inputArr[] = {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1};
        printArray(inputArr);

        int swapCount = sort(inputArr);

        System.out.println("Required " + swapCount + " swap(s) to partition the array.");

        printArray(inputArr);
        

    }


    // Sorting in ascending order
    static int sort(int arrayToSort[]){

        int leftIndex = 0;
        int rightIndex = arrayToSort.length - 1;
        int swapCount = 0;

        while(leftIndex < rightIndex){
            if(arrayToSort[leftIndex] == 1 && arrayToSort[rightIndex]== 0){
                //swap; can substitute 0 and 1 directly as well instead of swapping
                int temp = arrayToSort[leftIndex];
                arrayToSort[leftIndex] = arrayToSort[rightIndex];
                arrayToSort[rightIndex] = temp;
                swapCount++;

                leftIndex++;
                rightIndex--;
                continue;
            }
            if(arrayToSort[leftIndex] == 0){
                leftIndex++;
            }
            if(arrayToSort[rightIndex] == 1){
                rightIndex--;
            }
        }

        return swapCount;

    }

    static void printArray(int arrayToPrint[]){

        System.out.print("| ");

        for(int element : arrayToPrint){
            System.out.print(element + " | ");
        }
        System.out.println();

    }

}