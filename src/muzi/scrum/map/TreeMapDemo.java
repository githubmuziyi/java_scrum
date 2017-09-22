package muzi.scrum.map;

import java.util.Set;
import java.util.TreeMap;

/**
 * Created by muzi on 2017/9/23.
 * TreeMap:基于红黑树的map接口的实现
 */
class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("hello", "muzi");
        treeMap.put("world", "cunzhang");
        treeMap.put("java", "zhaogun");
        treeMap.put("world", "baba");
        Set<String> set = treeMap.keySet();
        for (String s:
             set) {
            System.out.println(s + "----" + treeMap.get(s));
        }
    }
}
