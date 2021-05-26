package com.dsa.sorting;

public class MergeSort{

    public static void main(String args[]){
        int inputArr[] = {2, 3, 1, 78, 4, 5, 9, 10, 32, 23, 23};
        printArray(inputArr);

        int startIndex = 0;
        int lastIndex = inputArr.length - 1;
        int tempArray[] = new int[inputArr.length];
        sort(inputArr, startIndex, lastIndex, tempArray);

        printArray(inputArr);

    }


    // Sorting in ascending order
    static void sort(int arrayToSort[], int startIndex, int lastIndex, int resultingArr[]){
        

        // split array - complete array, start index, end index
        if(startIndex == lastIndex){
            resultingArr[startIndex] = arrayToSort[startIndex];
            return;
        }

        int array1Start = startIndex;
        int array1End = (lastIndex + startIndex)/2;

        sort(arrayToSort, array1Start, array1End, resultingArr);
        

        int array2Start = (lastIndex + startIndex)/2 + 1;
        int array2End = lastIndex;
        sort(arrayToSort, array2Start, array2End, resultingArr);


        // code to to merge the above sorted subarrays
        int resultIndex = array1Start;
        int counter1 = array1Start; // for sub-array 1
        int counter2 = array2Start; // for sub-array 2

        for(
            
            ;counter1 <= array1End && counter2 <= array2End; 
            resultIndex++
            ){
                if(arrayToSort[counter1] < arrayToSort[counter2]){
                    resultingArr[resultIndex] = arrayToSort[counter1];
                    counter1++;
                    
                }else if(arrayToSort[counter1] == arrayToSort[counter2]){
                    resultingArr[resultIndex] = arrayToSort[counter1];
                    counter1++;

                    resultingArr[resultIndex] = arrayToSort[counter2];
                    counter2++;
                    resultIndex++;
                }else{
                    resultingArr[resultIndex] = arrayToSort[counter2];
                    counter2++;
                }
        }
        
        // at any time, one of the below for loop will be executed
        for(int i = resultIndex; counter1 <= array1End; i++, counter1++){
            resultingArr[i] = arrayToSort[counter1];
        }
        for(int i = resultIndex; counter2 <= array2End; i++, counter2++){
            resultingArr[i] = arrayToSort[counter2];
        }

        //the sorted portion needs to be transferred back to the input array
        for(int i = startIndex; i <= lastIndex; i++){
            arrayToSort[i] = resultingArr[i];
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