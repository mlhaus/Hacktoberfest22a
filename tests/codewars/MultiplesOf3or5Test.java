package codewars;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiplesOf3or5Test {
    @Test
    public void test() {
        assertEquals(23, new MultiplesOf3or5().solution(10));
        //New Tests
        assertEquals(45, new MultiplesOf3or5().solution(15));
        assertEquals(543, new MultiplesOf3or5().solution(50));
        assertEquals(3, new MultiplesOf3or5().solution(5));
    }
}