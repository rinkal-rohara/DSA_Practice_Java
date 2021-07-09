package com.dsa.searching.problems;

import org.junit.Test;
import org.junit.Assert;

import static com.dsa.searching.problems.OddCountElements.findElementsWithOddFrequency;

public class OddCountElementsTest {
    
    @Test
    public void positiveNumbersOnly(){
        int input[] = {1, 1, 2, 3, 4, 3, 2, 4, 4, 5, 5, 9, 1, 7, 8, 8, 9, 7};
        int expected = 5;
        int actual = findElementsWithOddFrequency(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void negativeNumbersOnly(){
        int input[] = {-1, -1, -2, -3, -4, -3, -2, -4, -4, -5, -5, -9, -1, -7, -8, -8, -9, -7};
        int expected = -5;
        int actual = findElementsWithOddFrequency(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void positiveAndNegative(){
        int input[] = {-1, -1, -2, 3, 4, 3, -2, 4, 4, -5, -5, -9, -1, -7, -8, -8, -9, -7};
        int expected = 3;
        int actual = findElementsWithOddFrequency(input);
        Assert.assertEquals(expected, actual);
    }
}
