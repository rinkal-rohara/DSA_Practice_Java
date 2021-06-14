/* Minimum swaps required to bring all elements less than given value together at the start of array. */
package com.dsa.sorting.problems;

public class PartitionByKey {

    public static void main(String args[]) {
        int inputArr[] = { 25, 56, 54, 12, 35, 99, 9999, 0, 7, 3, 45, 56 };
        printArray(inputArr);

        int swapCount = partition(inputArr, 50);

        System.out.println("Required " + swapCount + " swap(s) to partition the array.");

        printArray(inputArr);

    }

    // Sorting in ascending order
    static int partition(int arrayToSort[], int partitionKey) {
        int swapCount = 0;

        int leftPtr = 0;
        int rightPtr = arrayToSort.length - 1;

        while(leftPtr < rightPtr){

            if(arrayToSort[leftPtr] >= partitionKey && partitionKey > arrayToSort[rightPtr]){
                int temp = arrayToSort[leftPtr];
                arrayToSort[leftPtr] = arrayToSort[rightPtr];
                arrayToSort[rightPtr] = temp;
                swapCount++;
                leftPtr++;
                rightPtr--;
                continue;
            }
            if(arrayToSort[leftPtr] < partitionKey){
                leftPtr++;
            }
            if(arrayToSort[rightPtr] >= partitionKey){
                rightPtr--;
            }
            
        }
        return swapCount;
    }

    static void printArray(int arrayToPrint[]) {

        System.out.print("| ");

        for (int element : arrayToPrint) {
            System.out.print(element + " | ");
        }
        System.out.println();

    }

}
