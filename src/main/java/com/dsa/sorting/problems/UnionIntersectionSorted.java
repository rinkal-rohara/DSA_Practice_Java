/**
 * Given two unsorted arrays, find union and intersection of these two arrays
 */
package com.dsa.sorting.problems;

import java.util.Arrays;

public class UnionIntersectionSorted {

    public static void demo() {
        int arr1[] = { 1, 2, 3, 4, 5, 5, 6, 4, 3, 98, 89, 111 };
        int arr2[] = { 1, 2, 3, 4, 5, 5, 6, 4, 3, 98, 89, 111 };

        int union[] = findUnion(arr1, arr2);
        printArray(union);

        int intersection[] = findIntersection(arr1, arr2);
        printArray(intersection);
    }

    public static int[] findUnion(int arr1[], int arr2[]) {

        int totalElements = arr1.length + arr2.length;
        int result[] = new int[totalElements];
        int resultPtr = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int arr1Ptr = 0;
        int arr2Ptr = 0;

        while (arr1Ptr < arr1.length && arr2Ptr < arr2.length) {

            if (arr1Ptr != 0 && arr1[arr1Ptr] == arr1[arr1Ptr - 1]) {
                arr1Ptr++;
                continue;
            }
            if (arr2Ptr != 0 && arr2[arr2Ptr] == arr2[arr2Ptr - 1]) {
                arr2Ptr++;
                continue;
            }

            if (arr1[arr1Ptr] == arr2[arr2Ptr]) {
                result[resultPtr] = arr1[arr1Ptr];
                resultPtr++;

                arr1Ptr++;
                arr2Ptr++;
            } else if (arr1[arr1Ptr] < arr2[arr2Ptr]) {
                result[resultPtr] = arr1[arr1Ptr];
                resultPtr++;

                arr1Ptr++;
            } else {
                result[resultPtr] = arr2[arr2Ptr];
                resultPtr++;

                arr2Ptr++;
            }

        }

        while (arr1Ptr < arr1.length) {
            if (arr1Ptr != 0 && arr1[arr1Ptr] == arr1[arr1Ptr - 1]) {
                arr1Ptr++;
                continue;
            }
            result[resultPtr] = arr1[arr1Ptr];
            resultPtr++;

            arr1Ptr++;
        }

        while (arr2Ptr < arr2.length) {
            if (arr2Ptr != 0 && arr2[arr2Ptr] == arr2[arr2Ptr - 1]) {
                arr2Ptr++;
                continue;
            }
            result[resultPtr] = arr2[arr2Ptr];
            resultPtr++;

            arr2Ptr++;
        }

        int finalResult[] = new int[resultPtr];
        for (int i = 0; i < resultPtr; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    public static int[] findIntersection(int arr1[], int arr2[]) {
        int maxResSize = arr1.length < arr2.length ? arr1.length : arr2.length;
        int result[] = new int[maxResSize];
        int resultPtr = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        int arr1Ptr = 0;
        int arr2Ptr = 0;

        while (arr1Ptr < arr1.length && arr2Ptr < arr2.length) {

            if (arr1Ptr != 0 && arr1[arr1Ptr] == arr1[arr1Ptr - 1]) {
                arr1Ptr++;
                continue;
            }
            if (arr2Ptr != 0 && arr2[arr2Ptr] == arr2[arr2Ptr - 1]) {
                arr2Ptr++;
                continue;
            }

            if (arr1[arr1Ptr] == arr2[arr2Ptr]) {
                result[resultPtr] = arr1[arr1Ptr];
                resultPtr++;

                arr1Ptr++;
                arr2Ptr++;
            } else if (arr1[arr1Ptr] < arr2[arr2Ptr]) {
                arr1Ptr++;
            } else {
                arr2Ptr++;
            }

        }

        int finalResult[] = new int[resultPtr];
        for (int i = 0; i < resultPtr; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    static void printArray(int arrayToPrint[]) {

        System.out.print("| ");

        for (int element : arrayToPrint) {
            System.out.print(element + " | ");
        }
        System.out.println();

    }
}
