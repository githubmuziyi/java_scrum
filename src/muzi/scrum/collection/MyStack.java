package muzi.scrum.collection;

import java.util.LinkedList;

/**
 * Created by muzi on 2017/9/17.
 * 自定义栈集合 用LinkedList集合模拟栈数据结构
 */
class MyStack {

    private LinkedList link;

    public MyStack() {
        link = new LinkedList();
    }

    public void add(Object object) {
        link.addFirst(object);
    }

    public Object get() {
        return link.removeFirst();
    }

    public boolean isEmpty() {
        return link.isEmpty();
    }

}

class MyStackDemo {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.add("hello");
        ms.add("world");
        ms.add("java");

        while (!ms.isEmpty()) {
            System.out.println(ms.get());
        }
    }
}
