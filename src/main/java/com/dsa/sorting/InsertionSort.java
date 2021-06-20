package com.dsa.sorting;

public class InsertionSort{

    public static void demo(){
        int inputArr[] = {2, 3, 1, 78, 4, 5, 9, 10, 32, 23, 23};
        printArray(inputArr);

        sort(inputArr);

        printArray(inputArr);
        

    }


    // Sorting in ascending order
    static void sort(int arrayToSort[]){

        if(arrayToSort.length == 0){
            return;
        }

        int sortedArrayFirstIndex = 0;
        int min = arrayToSort[sortedArrayFirstIndex];

        int sortedArrayLastIndex = 0;
        int max = arrayToSort[sortedArrayLastIndex];

        for(int i = sortedArrayLastIndex + 1; i < arrayToSort.length; i++){ // traversing unsorted portion of array

            int targetNumber = arrayToSort[i];

            if(targetNumber >= max){
                sortedArrayLastIndex++;
                max = targetNumber;
            }else{


                // find the right index
                int index = -1;
                if(targetNumber < min){
                    index = sortedArrayFirstIndex;
                    min = targetNumber;
                }else{
                    //can use binary search as well
                    for(int j = sortedArrayFirstIndex; j <= sortedArrayLastIndex; j++){
                        if(targetNumber >= arrayToSort[j] && targetNumber < arrayToSort[j+1]){
                            index = j + 1;
                            break;
                        }
                    }
                }
                


                // place the number, shift all elements to right to make a place
                for(int counter = sortedArrayLastIndex; counter >=index; counter--){
                    arrayToSort[counter + 1] = arrayToSort[counter];

                }
                arrayToSort[index] = targetNumber;


                // increment sortedArrayLastIndex
                sortedArrayLastIndex++;

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