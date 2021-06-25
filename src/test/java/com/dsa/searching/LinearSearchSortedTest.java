package com.dsa.searching;

import static com.dsa.searching.LinearSearchSorted.search;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LinearSearchSortedTest {
    
    @Test
    public void shouldFindTarget(){
        int input[] = {10, 20, 30, 56, 78, 89, 99, 110, 560, 1000};
        int target = 99;
        int expectedIndex = 6;
        int actualIndex = search(input, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void shouldNotFindTarget(){
        int input[] = {10, 20, 30, 56, 78, 89, 99, 110, 560, 1000};
        int target = 100;
        int expectedIndex = -1;
        int actualIndex = search(input, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void whenTargetGreaterThanMax(){
        int input[] = {10, 20, 30, 56, 78, 89, 99, 110, 560, 1000};
        int target = 1100;
        int expectedIndex = -1;
        int actualIndex = search(input, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void whenTargetLessThanMin(){
        int input[] = {10, 20, 30, 56, 78, 89, 99, 110, 560, 1000};
        int target = 5;
        int expectedIndex = -1;
        int actualIndex = search(input, target);
        assertEquals(expectedIndex, actualIndex);
    }
}
