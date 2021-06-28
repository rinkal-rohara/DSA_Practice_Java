package com.dsa.searching.problems;

import org.junit.Test;
import org.junit.Assert;

import static com.dsa.searching.problems.FirstRepeatedElement.findFirstRepeatedElement;

public class FirstRepeatedElementTest {
    
    @Test
    public void whenAllElementsAreUnique(){

        int inputArr[] = {1, 2, 3, 4, 5, 66, 7, 8, 9, 10};
        int repeatedElement = findFirstRepeatedElement(inputArr);
        int expected = -1;
        Assert.assertEquals(expected, repeatedElement);
    }

    @Test
    public void whenOnlyOneRepeated(){

        int inputArr[] = {1, 2, 2, 4, 5, 66, 7, 8, 9, 10};
        int repeatedElement = findFirstRepeatedElement(inputArr);
        int expected = 2;
        Assert.assertEquals(expected, repeatedElement);
    }

    @Test
    public void whenMultipleRepeated(){

        int inputArr[] = {1, 2, 2, 4, 5, 5, 5, 8, 8, 10};
        int repeatedElement = findFirstRepeatedElement(inputArr);
        int expected = 2;
        Assert.assertEquals(expected, repeatedElement);
    }
}
