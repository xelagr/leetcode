package dynamic;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseRobberTest {

    @Test
    public void test1() {
        assertEquals(4, new HouseRobber().rob(new int[]{1,2,3,1}));
    }

    @Test
    public void test2() {
        assertEquals(12, new HouseRobber().rob(new int[]{2,7,9,3,1}));
    }

    @Test
    public void test4() {
        assertEquals(0, new HouseRobber().rob(new int[]{}));
    }

    @Test
    public void test5() {
        assertEquals(1, new HouseRobber().rob(new int[]{1}));
    }

    @Test
    public void test6() {
        assertEquals(2, new HouseRobber().rob(new int[]{1,2}));
    }

    @Test
    public void test7() {
        assertEquals(2, new HouseRobber().rob(new int[]{2,1}));
    }

    @Test
    public void test8() {
        assertEquals(12, new HouseRobber().rob(new int[]{2,1,8,9,1,1}));
    }

    @Test
    public void test9() {
        assertEquals(21, new HouseRobber().rob(new int[]{2,2,8,9,10,10}));
    }

    @Test
    public void test10() {
        assertEquals(19, new HouseRobber().rob(new int[]{2,4,8,9,9,3}));
    }

    @Test
    public void test11() {
        assertEquals(30, new HouseRobber().rob(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }

    @Test
    public void test12() {
        assertEquals(7102, new HouseRobber().rob(new int[]{226,174,214,16,218,48,153,131,128,17,157,142,88,43,37,157,43,221,191,68,206,23,225,82,54,118,111,46,80,49,245,63,25,194,72,80,143,55,209,18,55,122,65,66,177,101,63,201,172,130,103,225,142,46,86,185,62,138,212,192,125,77,223,188,99,228,90,25,193,211,84,239,119,234,85,83,123,120,131,203,219,10,82,35,120,180,249,106,37,169,225,54,103,55,166,124}));
    }

    @Test
    public void test13() {
        assertEquals(0, new HouseRobber().rob(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
    }

}
