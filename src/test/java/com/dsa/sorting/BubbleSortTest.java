package com.dsa.sorting;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import com.dsa.sorting.BubbleSort;

public class BubbleSortTest {


    @Test
    public void shouldSort()
    {
        int inputArr[] = {3, 2, 1, 5, 8, 9};
        int expectedArr[] = {1, 2, 3, 5, 8, 9};
        assertArrayEquals(expectedArr, BubbleSort.sort(inputArr) );
    }
}
