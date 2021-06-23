package com.dsa.sorting.problems;

import static com.dsa.sorting.problems.CheckReverse.checkReverse;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckReverseTest {
    
    @Test
    public void basicScenario(){

        int inputArr[] = {1, 2, 3, 4, 5, 6, 9, 8, 7, 10, 11};

        boolean result = checkReverse(inputArr);
        assertTrue(result);
    }

    @Test
    public void whenSubArrayExtendsTillEnd(){

        int inputArr[] = {1, 2, 3, 4, 5, 6, 9, 8, 7, 7, 7};

        boolean result = checkReverse(inputArr);
        assertTrue(result);
    }

    @Test
    public void whenSubArrayExtensTillEnd2(){

        int inputArr[] = {1, 2, 3, 4, 5, 6, 9, 8, 7, 7, 6};

        boolean result = checkReverse(inputArr);
        assertTrue(result);
    }

    @Test
    public void whenArrayIsAlreadySortedInDescendingOrder(){

        int inputArr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        boolean result = checkReverse(inputArr);
        assertTrue(result);
    }

    @Test
    public void whenArrayIsAlreadySortedInAscendingOrder(){

        int inputArr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        boolean result = checkReverse(inputArr);
        assertTrue(result);
    }

    @Test
    public void whenValuesAtBorderNotInSync(){

        int inputArr[] = {1, 2, 3, 4, 5, 6, 9, 8, 7, 7, 5};

        boolean result = checkReverse(inputArr);
        assertFalse(result);
    }

    @Test
    public void whenMultipleSubArraysFound(){

        int inputArr[] = {1, 2, 3, 4, 5, 6, 9, 8, 7, 10, 11, 12, 3, 2, 1, 15, 20};

        boolean result = checkReverse(inputArr);
        assertFalse(result);
    }

}
