package codingbat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test {

    @Test
    void marc_mapAB2() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "cat");
        map1.put("b", "cat");
        Map<String, String> map2 = Map1.mapAB2(map1);
        assertFalse(map2.containsKey("a"));
        assertFalse(map2.containsKey("b"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "cat");
        map3.put("b", "dog");
        Map<String, String> map4 = Map1.mapAB2(map3);
        assertTrue(map4.containsKey("a"));
        assertTrue(map4.containsKey("b"));
    }

    @Test
    void brendan_mapAB(){
        Map<String,String> map = new HashMap();
        map.put("a","aaa");
        map.put("b","bbb");

        Map<String,String> actual = Map1.mapAB(map);
        Map<String,String> expected = new HashMap();
        expected.put("a","aaa");
        expected.put("ab","aaabbb");
        expected.put("b","bbb");

        assertEquals(expected,actual);

        Map<String,String> map2 = new HashMap();
        map2.put("a","aaa");
        map2.put("c","bbb");

        Map<String,String> actual2 = Map1.mapAB(map2);
        Map<String,String> expected2 = new HashMap();
        expected2.put("a","aaa");
        expected2.put("c","bbb");

        assertEquals(expected2,actual2);
    }

}