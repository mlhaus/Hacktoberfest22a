package codingbat;

import org.junit.jupiter.api.Test;

import java.util.*;

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
    void brendan_wordLen(){
        String[] strings = {"words", "are", "counted", "by", "chars"};

        Map<String,Integer>expected = new HashMap<>();
        expected.put("words",5);
        expected.put("are",3);
        expected.put("counted",7);
        expected.put("by",2);
        expected.put("chars",5);

        Map<String, Integer> actual = Map2.wordLen(strings);

        assertEquals(expected,actual);

    }
}