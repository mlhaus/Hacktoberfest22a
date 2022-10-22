package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildAPileOfCubesTest {

    @Test
    public void test1() {
        assertEquals(2022, BuildAPileOfCubes.findNb(4183059834009L));
    }
    @Test
    public void test2() {
        assertEquals(-1, BuildAPileOfCubes.findNb(24723578342962L));
    }
    @Test
    public void test3() {
        assertEquals(4824, BuildAPileOfCubes.findNb(135440716410000L));
    }
    @Test
    public void test4() {
        assertEquals(3568, BuildAPileOfCubes.findNb(40539911473216L));
    }

    @Test
    public void testExtra1(){
        assertEquals(-1, BuildAPileOfCubes.findNb(400238111128493L));
    }

    @Test
    public void testExtra2(){
        assertEquals(-1, BuildAPileOfCubes.findNb(98765432123456789L));
    }

    @Test
    public void testExtra3(){
        assertEquals(4824, BuildAPileOfCubes.findNb(135440716410000L));
    }

}