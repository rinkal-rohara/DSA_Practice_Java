/* Given two sorted arrays. 
Sort the elements of these arrays so that first half of sorted elements will lie in first array
and second half lies in second array. Extra space allowed is O(1) */
package com.dsa.sorting.problems;

public class MergeArray {
    public static void demo(){
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {3,4,5,6,7,8};

        merge(arr1, arr2);
        printArray(arr1);
        printArray(arr2);

    }


    private static void merge(int arr1[], int arr2[]){

        int first[] = arr1[0] < arr2[0] ? arr1 : arr2;
        int second[] = arr1[0] < arr2[0] ? arr2 : arr1;

        int firstPtr = 0;

        while(firstPtr < first.length){
            if(first[firstPtr] > second[0]){

                int temp = second[0];
                second[0] = first[firstPtr];
                first[firstPtr] = temp;
                

                int temp2 = second[0];
                for(int i = 1; i < second.length; i++){
                    if(second[i] < temp2){
                        second[i - 1] = second[i];
                    }else{
                        second[i - 1] = temp2;
                        break;
                    }
                }
                
            }
            firstPtr++;
        }

    }

    private static void printArray(int arrayToPrint[]){

        System.out.print("| ");

        for(int element : arrayToPrint){
            System.out.print(element + " | ");
        }
        System.out.println();

    }
}