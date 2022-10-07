package codingbat;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test {

    @Test
    void marc_allSwap() {
        String[] strings = {"cat", "dog", "bunny", "caterpillar", "kangaroo", "kitten", "butterfly", "crocodile", "centipede"};
        String[] actual = Map2.allSwap(strings);
        String[] expected = {"caterpillar", "dog", "butterfly", "cat", "kitten", "kangaroo", "bunny", "centipede", "crocodile"};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void garion_word0(){
        String[] strings = {"a", "b", "a", "b", "c"};
        Map<String, Integer> actual = Map2.word0(strings);
        assertEquals(actual.get("a"), 0);
        assertEquals(actual.get("b"), 0);
        assertEquals(actual.get("c"), 0);
    }
}