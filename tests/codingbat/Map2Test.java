package codingbat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Map2Test {

    @Test
    void marc_allSwap() {
        String[] strings = {"cat", "dog", "bunny", "caterpillar", "kangaroo", "kitten", "butterfly", "crocodile", "centipede"};
        String[] actual = Map2.allSwap(strings);
        String[] expected = {"caterpillar", "dog", "butterfly", "cat", "kitten", "kangaroo", "bunny", "centipede", "crocodile"};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void parker_wordMultiple() {
        String[] strings = {"apple","pear","pineapple","strawberry","apple","strawberry","durian"};
        Map<String, Boolean> actual = Map2.wordMultiple(strings);
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("apple",true);
        expected.put("pear",false);
        expected.put("pineapple",false);
        expected.put("strawberry",true);
        expected.put("apple",true);
        expected.put("strawberry",true);
        expected.put("durian",false);
        assertEquals(expected,actual);
    }
}