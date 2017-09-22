package muzi.scrum.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by muzi on 2017/9/23.
 * HashMap:是基于哈希表的Map接口实现
 * 哈希表的作用是用来保证键的唯一性
 */
class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("it001", "muzi");
        hashMap.put("it002", "hewei");
        hashMap.put("it003", "cunzhang");
        hashMap.put("it004", "wangkai");

        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String, String> me:
             entries) {
            System.out.println(me.getKey() + "----" + me.getValue());
        }
    }
}
