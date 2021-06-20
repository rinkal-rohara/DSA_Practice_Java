/*Sort array according to the expression A.X*X; where A is some constant */
package com.dsa.sorting.problems;

public class ExpressionSort {

    public static void demo() {
        int inputArr[] = { 2, 3, 1, 78, 4, 5, 9, 10, 32, 23, 23 };
        printArray(inputArr);

        sort(inputArr, 5);// let A = 5;

        printArray(inputArr);

    }

    static boolean isFirstGreaterThanSecond(int val1, int val2, int A){
        int expressionVal1 = A * val1 * val1;
        int expressionVal2 = A * val2 * val2;
        return expressionVal1 > expressionVal2;
    }

    // Sorting in ascending order
    static void sort(int arrayToSort[], int A) {

        boolean swapHappenedInThePass = true;

        for (int pass = 0; pass < (arrayToSort.length - 1) && swapHappenedInThePass; pass++) {
            swapHappenedInThePass = false;
            for (int j = 0; j < arrayToSort.length - 1 - pass; j++) {
                if ( isFirstGreaterThanSecond(arrayToSort[j], arrayToSort[j + 1], A)) {
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
