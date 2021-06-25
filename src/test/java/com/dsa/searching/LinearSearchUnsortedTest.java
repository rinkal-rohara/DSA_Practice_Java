package com.dsa.searching;
import static com.dsa.searching.LinearSearchUnsorted.search;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LinearSearchUnsortedTest {
    
    @Test
    public void shouldFindTarget(){
        int input[] = {10, 98, 56, 99, 47, 35, 68, 1, 0, -1, 37, 12};
        int target = 99;
        int index = search(input, target);
        int expectedIndex = 3;
        assertEquals(expectedIndex, index);
    }

    @Test
    public void shouldNotFindTarget(){
        int input[] = {10, 98, 56, 99, 47, 35, 68, 1, 0, -1, 37, 12};
        int target = 100;
        int index = search(input, target);
        int expectedIndex = -1;
        assertEquals(expectedIndex, index);
    }
}
