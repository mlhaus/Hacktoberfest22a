package codewars;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTheOddTest {

    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, SortTheOdd.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, SortTheOdd.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, SortTheOdd.sortArray(new int[]{}));
    }
    @Test
    public void exampleTest4() {
        assertArrayEquals(new int[]{1,1,1,5,5,5}, SortTheOdd.sortArray(new int[]{5,1,5,1,5,1}));
    }
    @Test
    public void exampleTest5() {
        assertArrayEquals(new int[]{203,500,399,0,477}, SortTheOdd.sortArray(new int[]{477,500,399,0,203}));
    }
}