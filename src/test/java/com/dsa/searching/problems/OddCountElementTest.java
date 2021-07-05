package com.dsa.searching.problems;

import static com.dsa.searching.problems.OddCountElement.findElementWithOddCount;
import org.junit.Test;
import org.junit.Assert;


public class OddCountElementTest {

    @Test
    public void basicScenario(){
        int input[] = {1, 1, 2, 3, 3, 4, 5, 4, 5, 2, 6, 7, 8, 8, 7};

        int expected = 6;
        int actual = findElementWithOddCount(input);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void emptyArray(){
        int input[] = {};

        int expected = -1;
        int actual = findElementWithOddCount(input);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void onlyNegativeNumbers(){
        int input[] = {-1, -1, -2, -3, -3, -4, -5, -4, -5, -2, -6, -7, -8, -8, -7};

        int expected = -6;
        int actual = findElementWithOddCount(input);

        Assert.assertEquals(expected, actual);
    }
    

    @Test
    public void positiveAndNegativeNumbers(){
        int input[] = {-1, -1, 2, -3, -3, -4, 5, -4, 5, 2, -6, -7, 8, 8, -7};

        int expected = -6;
        int actual = findElementWithOddCount(input);

        Assert.assertEquals(expected, actual);
    }
}
