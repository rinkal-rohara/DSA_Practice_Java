/* 
    Given an array of integers and a range. 
    Write an algorithm to partition array so that values smaller than range come to left, 
    then values under the range followed with values greater than the range. 
*/
package com.dsa.sorting.problems;

public class RangePartition{

    public static void demo(){
        int inputArr[] = {10, 45, 4, 6, 76, 49, 50, 43, 67, 46, 98, 0, -3};
        printArray(inputArr);

        sort(inputArr, 40, 50);

        printArray(inputArr);
        

    }


    // Sorting in ascending order
    static void sort(int arrayToSort[], int lowerBound, int upperBound){
        int belowRangeLastIndex = -1;
        int aboveRangeFirstIndex = arrayToSort.length;

        int cursor = belowRangeLastIndex + 1;

        while(cursor > belowRangeLastIndex && cursor < aboveRangeFirstIndex){
            if(arrayToSort[cursor] < lowerBound){
                belowRangeLastIndex++;
                int temp = arrayToSort[cursor];
                arrayToSort[cursor] = arrayToSort[belowRangeLastIndex];
                arrayToSort[belowRangeLastIndex] = temp;

                if(cursor <= belowRangeLastIndex){
                    cursor++;
                }

            }else if(arrayToSort[cursor] > upperBound){
                aboveRangeFirstIndex--;
                int temp = arrayToSort[cursor];
                arrayToSort[cursor] = arrayToSort[aboveRangeFirstIndex];
                arrayToSort[aboveRangeFirstIndex] = temp;

            }else{
                cursor++;
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