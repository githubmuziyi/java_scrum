package muzi.scrum.collection;

import java.util.LinkedList;

/**
 * Created by muzi on 2017/9/17.
 * LinkedList特有功能
 * 1.添加
 *  addFirst(Object obj)
 *  addLast(Object obj)
 * 2.获取
 *  getFirst()
 *  getLast()
 * 3.删除
 *  removeFirst()
 *  removeLast()
 */
class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add("hello");
        link.add("world");

        link.addFirst("muzi");
        link.addLast("java");

        System.out.println(link);
        System.out.println(link.getFirst());
        System.out.println(link.getLast());
    }
}
