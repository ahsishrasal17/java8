import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;

public class Comparator7 {
    public static void main(String[] args)
    {
        Map<Integer, String> map = new TreeMap<>();
        map.put(2, "z");
        map.put(1, "s");
        map.put(3, "c");
        System.out.println("Original TreeMap " + map);
        Map<Integer, String> map1 = new TreeMap<>((a,b) -> b-a);
        map1.put(2, "z");
        map1.put(1, "s");
        map1.put(3, "c");
        System.out.println("TreeMap after using Comparator " + map1);
    }
}
