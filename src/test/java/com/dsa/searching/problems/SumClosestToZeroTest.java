package com.dsa.searching.problems;

import org.junit.Test;
import org.junit.Assert;

import static com.dsa.searching.problems.SumClosestToZero.findElementsWithSumClosestTo0;



public class SumClosestToZeroTest {
    

    @Test
    public void basicScenario1(){
        int input[] = {1, -1, -10, 5, 6, -7, 8, 9, -2};
        String expected = "-1, 1";
        String actual = findElementsWithSumClosestTo0(input);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void basicScenario2(){
        int input[] = {1, 1, -10, 5, 5, -7, 8, 9, -2};
        String expected = "-10, 9";
        String actual = findElementsWithSumClosestTo0(input);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void basicScenario3(){
        int input[] = {1, 1, -11, 5, 5, -7, 8, 9, -2};
        String expected = "-7, 8";
        String actual = findElementsWithSumClosestTo0(input);

        Assert.assertEquals(expected, actual);
    }
}
