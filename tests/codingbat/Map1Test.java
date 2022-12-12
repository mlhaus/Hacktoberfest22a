package codingbat;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test {

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

    @Test
    void joey_mapBully(){
        Map<String, String> map = new HashMap<>();
        map.put("a", "Duck");
        map.put("b", "Goose");

        Map<String, String> actual1 = new HashMap<>(Map1.mapBully(map));
        Map<String, String> expected1 = new HashMap<>(Map1.mapBully(map));
        expected1.put("a", "");
        expected1.put("b", "Duck");

        assertEquals(expected1, actual1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Dog");
        map2.put("b", "Cat");

        Map<String, String> actual2 = new HashMap<>(Map1.mapBully(map2));
        Map<String, String> expected2 = new HashMap<>(Map1.mapBully(map2));
        expected2.put("a", "");
        expected2.put("b", "Dog");

        assertEquals(expected2, actual2);
    }
    @Test
    void nick_mapAB4(){
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "cc");

        Map<String, String> actual1 = new HashMap<>(Map1.mapAB4(map));
        Map<String, String> expected1 = new HashMap<>();
        expected1.put("a", "");
        expected1.put("b", "");
        expected1.put("c", "cc");

        assertEquals(expected1, actual1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "a");
        map2.put("b", "bbb");
        map2.put("c", "");

        Map<String, String> actual2 = new HashMap<>(Map1.mapBully(map2));
        Map<String, String> expected2 = new HashMap<>();
        expected2.put("a", "a");
        expected2.put("b", "bbb");
        expected2.put("c", "bbb");

        assertEquals(expected2, actual2);
    }

}