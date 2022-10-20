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