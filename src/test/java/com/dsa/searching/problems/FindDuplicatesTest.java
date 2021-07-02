package com.dsa.searching.problems;

import static com.dsa.searching.problems.FindDuplicates.findDuplicates;

import org.junit.Assert;
import org.junit.Test;

public class FindDuplicatesTest {

    @Test
    public void allUnique(){
        int inputArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int res[] = findDuplicates(inputArr);
        int expected[] = {};

        Assert.assertArrayEquals(expected, res);
    }


    @Test
    public void only1DupInMiddle(){
        int inputArr[] = {1, 2, 3, 4, 5, 5, 7, 8, 9, 10};
        int res[] = findDuplicates(inputArr);
        int expected[] = {5};

        Assert.assertArrayEquals(expected, res);
    }

    @Test
    public void only1DupInBegining(){
        int inputArr[] = {1, 1, 3, 4, 5, 6, 7, 8, 9, 10};
        int res[] = findDuplicates(inputArr);
        int expected[] = {1};

        Assert.assertArrayEquals(expected, res);
    }

    @Test
    public void only1DupInEnd(){
        int inputArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 10, 10};
        int res[] = findDuplicates(inputArr);
        int expected[] = {10};

        Assert.assertArrayEquals(expected, res);
    }


    @Test
    public void multipleDupWithFreq2(){
        int inputArr[] = {1, 2, 3, 3, 5, 6, 7, 7, 9, 10};
        int res[] = findDuplicates(inputArr);
        int expected[] = {3, 7};

        Assert.assertArrayEquals(expected, res);
    }


    @Test
    public void multipleDupMultipleFreq(){
        int inputArr[] = {1, 2, 3, 3, 3, 6, 7, 7, 10, 10};
        int res[] = findDuplicates(inputArr);
        int expected[] = {3, 7, 10};

        Assert.assertArrayEquals(expected, res);
    }

    @Test
    public void emptyArray(){
        int inputArr[] = {};
        int res[] = findDuplicates(inputArr);
        int expected[] = {};

        Assert.assertArrayEquals(expected, res);
    }
    
}
