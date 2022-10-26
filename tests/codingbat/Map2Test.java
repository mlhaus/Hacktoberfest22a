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

    @Test
    void garion_word0(){
        String[] strings = {"a", "b", "a", "b", "c"};
        Map<String, Integer> actual = Map2.word0(strings);
        assertEquals(actual.get("a"), 0);
        assertEquals(actual.get("b"), 0);
        assertEquals(actual.get("c"), 0);
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