package muzi.scrum.map;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by muzi on 2017/9/23.
 * Map接口的哈希表和链表实现，具有可预知的迭代顺序
 */
class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("muzi", "hello");
        linkedHashMap.put("hewei", "world");
        linkedHashMap.put("cunzhang", "java");
        Set<String> set = linkedHashMap.keySet();
        for (String s:
             set) {
            System.out.println(s + "----" + linkedHashMap.get(s));
        }
    }
}
