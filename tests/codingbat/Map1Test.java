package codingbat;

import org.junit.jupiter.api.Test;

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
    void alex_topping3(){
        Map<String, String> foodMapTest = new HashMap<>();
        foodMapTest.put("potato", "salt");
        foodMapTest.put("salad", "ham");
        foodMapTest.put("sandwich", "pasta");
        Map<String, String> foodMapTest2 = Map1.topping3(foodMapTest);

        //get fries assert
        assertEquals(foodMapTest2.get("fries"), foodMapTest.get("potato"));
        assertEquals(foodMapTest2.get("spinach"), foodMapTest.get("salad"));
        assertEquals(foodMapTest2.get("sandwich"), foodMapTest.get("sandwich"));
    }

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
    void jacci_mapShare() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c", "ccc");
        map1.put("d", "ddd");
        Map<String, String> map2 = Map1.mapShare(map1);
        assertFalse(map2.containsKey("c"));
        assertTrue(map2.get("b").equals("aaa"));
        assertTrue(map2.get("d").equals("ddd"));
        assertTrue(map2.get("a").equals("aaa"));
        //assertEquals(map1, map2);
    }

    @Test
    void parker_mapAB3() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "apple");
        map1.put("c", "crab");
        Map<String, String> map2 = Map1.mapAB3(map1);
        assertTrue(map2.containsKey("b"));
        Map<String, String> map3 = new HashMap<>();
        map1.put("b", "beef");
        map1.put("c", "crab");
        Map<String, String> map4 = Map1.mapAB3(map1);
        assertTrue(map2.containsKey("a"));
    }
    
    @Test
    void garion_topping1(){
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "ice cream");
        map1.put("b", "cherry");
        map1.put("c", "bread");
        map1.put("d", "butter");
        Map<String, String> map2 = Map1.mapAB2(map1);
        assertTrue(map1.containsKey("a"));
        assertTrue(map1.containsKey("b"));
        assertTrue(map1.containsKey("c"));
        assertTrue(map1.containsKey("d"));
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

    }

}