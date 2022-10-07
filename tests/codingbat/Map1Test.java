package codingbat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
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

}