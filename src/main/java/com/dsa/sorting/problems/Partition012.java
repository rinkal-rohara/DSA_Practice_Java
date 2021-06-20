/* 
    Given an array containing 0s, 1s and 2s. 
    Write an algorithm to sort array so that 0s come first followed by 1s and then 2s in the end. 
*/
package com.dsa.sorting.problems;

public class Partition012{

    public static void demo(){
        int inputArr[] = {0, 0, 0, 2, 1, 1, 0, 2, 1, 1, 1, 0, 1, 2, 2};
        printArray(inputArr);

        sort(inputArr);

        printArray(inputArr);
        

    }


    // Sorting in ascending order
    static void sort(int arrayToSort[]){
        int last0Index = -1;
        int first2Index = arrayToSort.length;
        int pointer = last0Index + 1;

        while(pointer < first2Index){
            if(arrayToSort[pointer] == 0){
                last0Index++;
                int temp = arrayToSort[pointer];
                arrayToSort[pointer] = arrayToSort[last0Index];
                arrayToSort[last0Index] = temp;

                if(pointer <= last0Index){
                    pointer++;
                }

            }else if(arrayToSort[pointer] == 2){
                first2Index--;
                int temp = arrayToSort[pointer];
                arrayToSort[pointer] = arrayToSort[first2Index];
                arrayToSort[first2Index] = temp;
            }else{
                pointer++;
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