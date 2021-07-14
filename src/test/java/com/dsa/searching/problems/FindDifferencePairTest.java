package com.dsa.searching.problems;

import org.junit.Test;
import org.junit.Assert;
import static com.dsa.searching.problems.FindDifferencePair.findDifferencePair;


public class FindDifferencePairTest {
    
    @Test
    public void basicSenario1(){
        int input[] = {45, 86, 809, 23, 4, 10, 0, 7, 546, 2900, 123};
        int targetDiff = 45 - 23;
        int actual = findDifferencePair(input, targetDiff);
        int expected = 23;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void basicSenario2(){
        int input[] = {45, 86, 809, 23, 4, 1, 0, 7, 546, 2900, 123};
        int targetDiff = 1 - 0;
        int actual = findDifferencePair(input, targetDiff);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void basicSenario3(){
        int input[] = {45, 86, 809, 23, 4, 1, 0, 7, 546, 2900, 123};
        int targetDiff = 2900 - 809;
        int actual = findDifferencePair(input, targetDiff);
        int expected = 809;
        Assert.assertEquals(expected, actual);
    }

}
