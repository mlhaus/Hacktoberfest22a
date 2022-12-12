package codewars;

import org.junit.jupiter.api.Test;

import static codewars.BreakCamelCase.camelCase;
import static codewars.Solution.*;
import static org.junit.jupiter.api.Assertions.*;

class BreakCamelCaseTest {
    @Test
    public void test1() {
        assertEquals( "Incorrect", "camel Casing", camelCase("camelCasing"));
    }

    @Test
    public void test2(){
        assertEquals( "Incorrect", "camel Casing Test", camelCase("camelCasingTest"));
    }

    @Test
    public void test3() {
        assertEquals("Incorrect", "camelcasingtest", camelCase("camelcasingtest"));
    }

    @Test
    public void myTest1() {
        assertEquals("Incorrect", "myfirsttest", camelCase("myfirsttest"));
    }

    @Test
    public void myTest2() {
        assertEquals("Incorrect", "second Test", camelCase("secondTest"));
    }


}