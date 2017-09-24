package muzi.scrum.map;

import java.util.HashMap;

/**
 * Created by muzi on 2017/9/23.
 * Hashtable和HashMap的区别：
 *  Hashtable: 线程安全，效率低，不允许null键和null值
 *  HashMap：线程不安全，效率高，允许null键null值
 */
class HashtableDemo {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(null, "hello");
        hashMap.put("world", null);
        System.out.println(hashMap);
    }
}
