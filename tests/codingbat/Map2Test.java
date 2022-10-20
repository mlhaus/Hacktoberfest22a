package codingbat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test {

    @Test
    void eli_wordAppend() {
        String[] string1 = new String[] {"a", "b", "a", "", "b"};
        String[] string2 = new String[] {"", "b", "a", "c", "c"};
        assertEquals("ab", Map2.wordAppend(string1));
        assertFalse(Map2.wordAppend(string1).equals(Map2.wordAppend(string2)));
    }
}