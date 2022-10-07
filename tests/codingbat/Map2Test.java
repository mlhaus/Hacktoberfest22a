package codingbat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Map2Test {

    @Test
    void alex_wordCount(){
        String[] newString = {"hello", "hello", "hi", "greetings", "hi", "hello"};

        Map<String, Integer> testMap = new HashMap<String, Integer>();
        testMap = Map2.wordCount(newString);
        assertEquals(testMap.get("hello"), 3);
        assertEquals(testMap.get("hi"), 2);
        assertEquals(testMap.get("greetings"), 1);
    }


    @Test
    void marc_allSwap() {
        String[] strings = {"cat", "dog", "bunny", "caterpillar", "kangaroo", "kitten", "butterfly", "crocodile", "centipede"};
        String[] actual = Map2.allSwap(strings);
        String[] expected = {"caterpillar", "dog", "butterfly", "cat", "kitten", "kangaroo", "bunny", "centipede", "crocodile"};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}