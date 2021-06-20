package com.dsa.sorting;

public class QuickSelect{

    public static void demo(){
        //int inputArr[] = {2, 3, 1, 78, 4, 5, 9, 10, 32, 23, 23};
        //int inputArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int inputArr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        printArray(inputArr);

        int targetElem = 5;

        int index = findIndex(inputArr, 0, inputArr.length - 1, targetElem);

        System.out.println("Number "+ targetElem+" is at index: " + index);

        printArray(inputArr);
        

    }


    // Sorting in ascending order
    // left ==> less or equal
    // right ==> greater
    static int findIndex(int arrayToSort[], int startIndex, int endIndex, int targetElem){

        if(endIndex < startIndex){
            return -1;
        }else if(endIndex == startIndex){
            return arrayToSort[startIndex] == targetElem ? startIndex : -1;
        }

        // select startIndex as pinku
        int pinku = arrayToSort[startIndex];
        int pinkuIndex = startIndex;


        for(int i = startIndex + 1; i <= endIndex; i++){
            if(arrayToSort[i] <= pinku){
                arrayToSort[pinkuIndex] = arrayToSort[i];
                arrayToSort[i] = arrayToSort[pinkuIndex + 1];
                arrayToSort[pinkuIndex + 1] = pinku;
                pinkuIndex++;
            }
        }

        
        if(targetElem <= pinku){
            // search in left
            return findIndex(arrayToSort, startIndex, pinkuIndex, targetElem);
        }else{
            return findIndex(arrayToSort, pinkuIndex + 1, endIndex, targetElem);
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