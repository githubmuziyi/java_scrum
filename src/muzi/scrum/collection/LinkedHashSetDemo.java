package muzi.scrum.collection;

import java.util.LinkedHashSet;

/**
 * Created by muzi on 2017/9/21.
 * 底层结构为哈希表和链表
 * 哈希表保证元素的唯一性
 * 链表保证元素的有序（存取和取出有序）
 */
class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        for (String s:
             hs) {
            System.out.println(s);
        }
    }
}
