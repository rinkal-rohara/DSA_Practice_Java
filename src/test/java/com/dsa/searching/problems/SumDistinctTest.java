package com.dsa.searching.problems;


import org.junit.Test;
import org.junit.Assert;

import static com.dsa.searching.problems.SumDistinct.findSumOfDistinctElements;


public class SumDistinctTest {
    
    @Test
    public void allUnique(){
        int input[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 55;
        int actual = findSumOfDistinctElements(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void someDuplicates(){
        int input[] = {1, 2, 3, 4, 5, 5, 7, 3, 9, 10};
        int expected = 41;
        int actual = findSumOfDistinctElements(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void duplicatesAtStart(){
        int input[] = {1, 1, 1, 4, 5, 6, 7, 8, 9, 10};
        int expected = 50;
        int actual = findSumOfDistinctElements(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void duplicatesAtEnd(){
        int input[] = {1, 2, 3, 4, 5, 6, 7, 8, 10, 10};
        int expected = 46;
        int actual = findSumOfDistinctElements(input);
        Assert.assertEquals(expected, actual);
    }
}
