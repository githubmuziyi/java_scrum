package muzi.scrum.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by muzi on 2017/9/20.
 * Collection
 *     |--List
 *          有序（存入顺序和取出顺序不变），可重复
 *     |--Set
 *          无序，不可重复
 */
class SetDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("java");
        set.add("hello");
        set.add("world");
        for (String s:
             set) {
            System.out.println(s);
        }
    }
}
