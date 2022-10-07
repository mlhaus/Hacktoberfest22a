package codewars;
import java.util.*;

public class FindTheOddInt {
    public static int findIt(int[] a) {
        int odd = 0;
        Map<Integer, Integer> ints = new HashMap();
        for (int i : a) {
            if (ints.containsKey(i)) {
                ints.put(i, ints.get(i) + 1);
            } else {
                ints.put(i, 1);
            }
        }
        for(int key: ints.keySet()){
            if(ints.get(key)%2!=0){
                odd = key;
            }
        }
        return odd;

    }
}
