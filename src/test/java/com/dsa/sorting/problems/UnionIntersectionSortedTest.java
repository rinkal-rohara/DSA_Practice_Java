package com.dsa.sorting.problems;

import static com.dsa.sorting.problems.UnionIntersectionSorted.findUnion;
import static com.dsa.sorting.problems.UnionIntersectionSorted.findIntersection;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class UnionIntersectionSortedTest {

    @Test
    public void basicScenario(){
        int arr1[] = {1, 2, 3, 4, 5, 5, 6, 4, 3, 98, 89, 111};
        int arr2[] = {1, 2, 56, 89, 75, 3, 98, 89, 111};

        int union[] = findUnion(arr1, arr2);
        
        int expecteds[] = {1, 2, 3, 4, 5, 6, 56, 75, 89, 98, 111};
        assertArrayEquals(expecteds, union);
    }

    @Test
    public void entirelyDifferentArrays(){
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {7, 8, 9, 10};

        int union[] = findUnion(arr1, arr2);
        
        int expecteds[] = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        assertArrayEquals(expecteds, union);
    }

    @Test
    public void singleElementArrays(){
        int arr1[] = {1};
        int arr2[] = {4};

        int union[] = findUnion(arr1, arr2);
        
        int expecteds[] = {1, 4};
        assertArrayEquals(expecteds, union);
    }


    @Test
    public void basicIntersectionScenario(){
        int arr1[] = {1, 2, 3, 4, 5, 5, 6, 4, 3, 98, 89, 111};
        int arr2[] = {1, 2, 56, 89, 75, 3, 98, 89, 111};

        int union[] = findIntersection(arr1, arr2);
        
        int expecteds[] = {1, 2, 3, 89, 98, 111};
        assertArrayEquals(expecteds, union);
    }

    @Test
    public void entirelyDifferentArraysIntersection(){
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {7, 8, 9, 10};

        int union[] = findIntersection(arr1, arr2);
        
        int expecteds[] = {};
        assertArrayEquals(expecteds, union);
    }

    @Test
    public void singleElementArraysIntersection(){
        int arr1[] = {1};
        int arr2[] = {1};

        int union[] = findIntersection(arr1, arr2);
        
        int expecteds[] = {1};
        assertArrayEquals(expecteds, union);
    }
    
}
