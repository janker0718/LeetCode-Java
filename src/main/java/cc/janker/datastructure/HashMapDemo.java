package cc.janker.datastructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        System.out.println("1".hashCode());
        int h;
        String k = "1";
        int hash = (k == null) ? 0 : (h = k.hashCode()) ^ (h >>> 16);
        System.out.println(hash);
        map.put("1","2");
    }
}
