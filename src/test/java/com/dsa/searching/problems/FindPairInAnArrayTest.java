package com.dsa.searching.problems;

import org.junit.Test;
import org.junit.Assert;
import static com.dsa.searching.problems.FindPairInAnArray.findPair;



public class FindPairInAnArrayTest {

    @Test
    public void basicScenario1(){
        int input[] = {5, 98, 62, 47, 31, 52, 58, 46, 444, 97, 0, 68, 786 };
        int actual = findPair(input, 67);
        int expected = 5;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void basicScenario2(){
        int input[] = {5, 98, 62, 47, 31, 52, 58, 46, 444, 97, 0, 68, 786 };
        int actual = findPair(input, 68);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void basicScenario3(){
        int input[] = {5, 98, 62, 47, 31, 52, 58, 46, 444, 97, 0, 68, 786 };
        int actual = findPair(input, 542);
        int expected = 98;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void negativeScenario(){
        int input[] = {5, 98, 62, 47, 31, 52, 58, 46, 444, 97, 0, 68, 786 };
        int actual = findPair(input, 1);
        int expected = -1;

        Assert.assertEquals(expected, actual);
    }
}
