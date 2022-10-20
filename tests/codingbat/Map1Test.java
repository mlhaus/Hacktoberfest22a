package codingbat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test {

    @Test
    void eli_topping2() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "cherry");
        map1.put("spinach", "dressing");
        Map<String, String> map2 = new HashMap<>();
        map2 = Map1.topping2(map1);
        assertEquals("cherry", map2.get("yogurt"));
        assertEquals("nuts", map2.get("spinach"));
        assertTrue(map2.get("ice cream").equals(map2.get("yogurt")));
        assertFalse(map2.get("spinach").equals("dressing"));
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
        map2.put("a","bbb");

        Map<String,String> actual2 = Map1.mapAB(map2);
        Map<String,String> expected2 = new HashMap();
        expected2.put("a","aaa");
        expected2.put("a","bbb");

        assertEquals(expected2,actual2);
    }

}