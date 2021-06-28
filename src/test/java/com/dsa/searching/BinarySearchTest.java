package com.dsa.searching;

import static com.dsa.searching.BinarySearch.search;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void whenTargetLessThanMin(){
        int inputArr[] = {4, 5, 6, 7, 8, 9, 10};
        int target = 2;
        int actualIndex = search(inputArr, target);
        int expectedIndex = -1;

        Assert.assertEquals(expectedIndex, actualIndex);
    }


    @Test
    public void whenTargetGreaterThanMax(){
        int inputArr[] = {4, 5, 6, 7, 8, 9, 10};
        int target = 12;
        int actualIndex = search(inputArr, target);
        int expectedIndex = -1;
        
        Assert.assertEquals(expectedIndex, actualIndex);
    }


    @Test
    public void whenTargetIsMinVal(){
        int inputArr[] = {4, 5, 6, 7, 8, 9, 10};
        int target = 4;
        int actualIndex = search(inputArr, target);
        int expectedIndex = 0;
        
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void whenTargetIsMaxVal(){
        int inputArr[] = {4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        int actualIndex = search(inputArr, target);
        int expectedIndex = 6;
        
        Assert.assertEquals(expectedIndex, actualIndex);
    }


    @Test
    public void whenTargetIsAbsent(){
        int inputArr[] = {4, 5, 6, 7, 9, 9, 10};
        int target = 8;
        int actualIndex = search(inputArr, target);
        int expectedIndex = -1;
        
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void whenTargetIsPresent1(){
        int inputArr[] = {4, 5, 6, 7, 8, 9, 10};
        int target = 6;
        int actualIndex = search(inputArr, target);
        int expectedIndex = 2;
        
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void whenTargetIsPresent2(){
        int inputArr[] = {4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int actualIndex = search(inputArr, target);
        int expectedIndex = 3;
        
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void whenTargetIsPresent3(){
        int inputArr[] = {4, 5, 6, 7, 8, 9, 10, 11};
        int target = 7;
        int actualIndex = search(inputArr, target);
        int expectedIndex = 3;
        
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void whenTargetIsPresent5(){
        int inputArr[] = {4, 5, 6, 7, 8, 9, 10, 11};
        int target = 8;
        int actualIndex = search(inputArr, target);
        int expectedIndex = 4;
        
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void whenTargetIsPresent6(){
        int inputArr[] = {4, 5, 6, 7, 8, 9, 10, 11};
        int target = 6;
        int actualIndex = search(inputArr, target);
        int expectedIndex = 2;
        
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void whenTargetIsPresent7(){
        int inputArr[] = {4, 5, 6, 7, 8, 9, 10, 11};
        int target = 9;
        int actualIndex = search(inputArr, target);
        int expectedIndex = 5;
        
        Assert.assertEquals(expectedIndex, actualIndex);
    }
    
}
