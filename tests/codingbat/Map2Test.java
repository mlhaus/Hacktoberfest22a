package codingbat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Map2Test {

    @Test
    void marc_allSwap() {
        String[] strings = {"cat", "dog", "bunny", "caterpillar", "kangaroo", "kitten", "butterfly", "crocodile", "centipede"};
        String[] actual = Map2.allSwap(strings);
        String[] expected = {"caterpillar", "dog", "butterfly", "cat", "kitten", "kangaroo", "bunny", "centipede", "crocodile"};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
    @Test
    void jacci_firstChar() {
        String[] strings = {"red", "blue", "green", "brown", "gold", "rust", "yellow"};
        Map<String, String> actual = new HashMap<>(Map2.firstChar(strings));
        Map<String, String> expected = new HashMap<>(actual);
        assertFalse(expected.equals(null));
        assertTrue(expected.get("r").equals("redrust"));
        assertTrue(expected.get("b").equals("bluebrown"));
        assertTrue(expected.get("g").equals("greengold"));
        assertTrue(expected.get("y").equals("yellow"));
        assertEquals(expected, actual);
    }
}