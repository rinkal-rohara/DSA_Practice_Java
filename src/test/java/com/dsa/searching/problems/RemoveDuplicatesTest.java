package com.dsa.searching.problems;

import org.junit.Assert;
import org.junit.Test;
import static com.dsa.searching.problems.RemoveDuplicates.removeDuplicates;

public class RemoveDuplicatesTest {

    @Test
    public void allUnique(){
        int input[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result[] = removeDuplicates(input);

        int expected[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void singleDuplicateAtBegining(){
        int input[] = {1, 1, 3, 4, 5, 6, 7, 8, 9, 10};
        int result[] = removeDuplicates(input);

        int expected[] = {3, 4, 5, 6, 7, 8, 9, 10};

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void singleDuplicateAtEnd(){
        int input[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        int result[] = removeDuplicates(input);

        int expected[] = {1, 2, 3, 4, 5, 6, 7, 8};

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void singleDuplicateInMiddle(){
        int input[] = {1, 2, 3, 4, 5, 5, 7, 8, 9, 10};
        int result[] = removeDuplicates(input);

        int expected[] = {1, 2, 3, 4, 7, 8, 9, 10};

        Assert.assertArrayEquals(expected, result);
    }


    @Test
    public void multiplaDuplicates(){
        int input[] = {1, 1, 3, 3, 5, 6, 6, 6, 9, 10};
        int result[] = removeDuplicates(input);

        int expected[] = {5, 9, 10};

        Assert.assertArrayEquals(expected, result);
    }
    
}
