package muzi.scrum.collection;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by muzi on 2017/9/17.
 */
class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add("hello");
        array.add("world");
        array.add("java");
        ListIterator lit = array.listIterator();
        while (lit.hasNext()) {
            String s = (String) lit.next();
            System.out.println(s);
        }
        System.out.println("-----------");
        for (int i = 0; i < array.size(); i++) {
            String s = (String) array.get(i);
            System.out.println(s);
        }
        System.out.println("-----------");
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("java");
        //去除重复的集合元素
        System.out.println(array);
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i).equals(array.get(j))) {
                    array.remove(j);
                    j--;
                }
            }
        }
        System.out.println(array);
    }
}
