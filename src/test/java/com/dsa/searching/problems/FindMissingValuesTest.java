package com.dsa.searching.problems;

import org.junit.Assert;
import org.junit.Test;
import static com.dsa.searching.problems.FindMissingValues.findMissingValues;

import java.util.HashSet;

public class FindMissingValuesTest {
    

    @Test
    public void basicScenario(){

        int input[] = {1, 2, 3, 4, 6, 8, 9, 10, 11, 12};
        HashSet<Integer> missingValues = findMissingValues(input);

        Assert.assertTrue(missingValues.contains(5));
        Assert.assertTrue(missingValues.contains(7));
        Assert.assertFalse(missingValues.contains(0));
        Assert.assertFalse(missingValues.contains(13));
    }

    @Test
    public void onlyNegativeNumbers(){

        int input[] = {-1, -2, -3, -4, -6, -8, -9, -10, -11, -12};
        HashSet<Integer> missingValues = findMissingValues(input);

        Assert.assertTrue(missingValues.contains(-5));
        Assert.assertTrue(missingValues.contains(-7));
        Assert.assertFalse(missingValues.contains(0));
        Assert.assertFalse(missingValues.contains(-13));
    }


    @Test
    public void withNegativeNumbers(){

        int input[] = {-1, -2, 3, 4, 6, 8, 9, 10, 11, 12};
        HashSet<Integer> missingValues = findMissingValues(input);

        Assert.assertTrue(missingValues.contains(0));
        Assert.assertTrue(missingValues.contains(1));
        Assert.assertTrue(missingValues.contains(2));
        Assert.assertTrue(missingValues.contains(5));
        Assert.assertTrue(missingValues.contains(7));
        Assert.assertFalse(missingValues.contains(-3));
        Assert.assertFalse(missingValues.contains(13));
    }
}
