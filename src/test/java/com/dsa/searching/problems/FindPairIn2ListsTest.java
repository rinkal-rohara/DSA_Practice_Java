package com.dsa.searching.problems;

import org.junit.Test;
import org.junit.Assert;
import static com.dsa.searching.problems.FindPairIn2Lists.findPair;




public class FindPairIn2ListsTest {
    

    @Test(timeout = 5000)
    public void basicSenario1(){
        int x[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int y[] = { 5, 14, 3, 17};
        int target = 14;
        int actual = findPair(x, y, target);
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void basicSenario2(){
        int x[] = {1, 2, 33, 54, 5, 63, 7, 68, 9, 110};
        int y[] = { 5, 14, 73, 107};
        int target = 80;
        int actual = findPair(x, y, target);
        int expected = 73;
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void basicSenario3(){
        int x[] = {1, 102, 83, 24, 545, 6, 97, 68, 9, 130};
        int y[] = { 5, 14, 3, 17};
        int target = 97;
        int actual = findPair(x, y, target);
        int expected = 14;
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void negativeScenario(){
        int x[] = {1, 102, 83, 24, 545, 6, 97, 68, 9, 130};
        int y[] = { 5, 14, 3, 17};
        int target = 907;
        int actual = findPair(x, y, target);
        int expected = -1;
        Assert.assertEquals(expected, actual);
    }
}
