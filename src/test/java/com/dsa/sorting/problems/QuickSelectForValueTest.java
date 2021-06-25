package com.dsa.sorting.problems;

import static com.dsa.sorting.problems.QuickSelectForValue.findValueAtIndex;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QuickSelectForValueTest {
    

    @Test
    public void positiveScenario(){
        String input[] = {"hello", "hey", "world", "how", "are", "you"};
        int targetIndex = 2;
        String expected = "hey";
        String actual = findValueAtIndex(input, targetIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void wrongTargetIndex1(){
        String input[] = {"hello", "hey", "world", "how", "are", "you"};
        int targetIndex = 8;
        String expected = null;
        String actual = findValueAtIndex(input, targetIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void wrongTargetIndex2(){
        String input[] = {"hello", "hey", "world", "how", "are", "you"};
        int targetIndex = -8;
        String expected = null;
        String actual = findValueAtIndex(input, targetIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void wrongTargetIndex3(){
        String input[] = {"hello", "hey", "world", "how", "are", "you"};
        int targetIndex = 6;
        String expected = null;
        String actual = findValueAtIndex(input, targetIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void checkingAtFirstIndex(){
        String input[] = {"hello", "hey", "world", "how", "are", "you"};
        int targetIndex = 0;
        String expected = "are";
        String actual = findValueAtIndex(input, targetIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void checkingAtLastIndex(){
        String input[] = {"hello", "hey", "world", "how", "are", "you"};
        int targetIndex = 5;
        String expected = "you";
        String actual = findValueAtIndex(input, targetIndex);
        assertEquals(expected, actual);
    }
}
