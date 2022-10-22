package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestFindTheOddInt {

    @Test
    public void findTest() {
        assertEquals(5, FindTheOddInt.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        assertEquals(-1, FindTheOddInt.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        assertEquals(5, FindTheOddInt.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        assertEquals(10, FindTheOddInt.findIt(new int[]{10}));
        assertEquals(10, FindTheOddInt.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        assertEquals(1, FindTheOddInt.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));

        //my tests
        assertEquals(13,FindTheOddInt.findIt(new int[]{13,13,23,13,23,45,45,5,76,76,5}));
        assertEquals(5,FindTheOddInt.findIt(new int[]{5,2,2,7,8,5,7,2,3,8,5,9,5,3,2,5,9}));
    }
}
