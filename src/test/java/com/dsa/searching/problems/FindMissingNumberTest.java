package com.dsa.searching.problems;

import org.junit.Assert;
import org.junit.Test;
import static com.dsa.searching.problems.FindMissingNumber.findMissingNumber;

public class FindMissingNumberTest {


    @Test
    public void basicScenario(){

        int input[] = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int missingNum = findMissingNumber(input, 1, 10);
        int expectedNum = 5;

        Assert.assertEquals(expectedNum, missingNum);
    }


    @Test
    public void whenListContainsNegativeNumbers(){

        int input[] = {-2, -1, 0, 1, 2, 3, 4, 6, 7, 8, 9, 10};
        int missingNum = findMissingNumber(input, -2, 10);
        int expectedNum = 5;

        Assert.assertEquals(expectedNum, missingNum);
    }
    
}
