/*Sort array according to the absolute difference from the given value */
package com.dsa.sorting.problems;

public class AbsoluteSort {

    public static void demo() {
        int inputArr[] = { 2, 3, 1, 78, 4, 5, 9, 10, 32, 23, 23 };
        printArray(inputArr);

        sort(inputArr, 5);

        printArray(inputArr);

    }

    static boolean isFirstGreaterThanSecond(int val1, int val2, int reference){
        int absDiff1 = Math.abs(val1 - reference);
        int absDiff2 = Math.abs(val2 - reference);
        return absDiff1 > absDiff2;
    }

    // Sorting in ascending order
    static void sort(int arrayToSort[], int reference) {

        boolean swapHappenedInThePass = true;

        for (int pass = 0; pass < (arrayToSort.length - 1) && swapHappenedInThePass; pass++) {
            swapHappenedInThePass = false;
            for (int j = 0; j < arrayToSort.length - 1 - pass; j++) {
                if ( isFirstGreaterThanSecond(arrayToSort[j], arrayToSort[j + 1], reference)) {
                    // swap
                    int temp = arrayToSort[j + 1];
                    arrayToSort[j + 1] = arrayToSort[j];
                    arrayToSort[j] = temp;
                    swapHappenedInThePass = true;
                }
                
            }
        }

        return;
    }

    static void printArray(int arrayToPrint[]) {

        System.out.print("| ");

        for (int element : arrayToPrint) {
            System.out.print(element + " | ");
        }
        System.out.println();

    }

}
