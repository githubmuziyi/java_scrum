package muzi.scrum.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by muzi on 2017/9/17.
 * 有序的collection(也称为序列)，此接口的用户可以对列表中的每个元素的插入位置进行精确的控制
 * 用户可以根据元素的整数索引访问元素，并搜索列表中的元素
 * 与set不同，列表允许重复的元素
 *
 * List子类特点：
 *  1.ArrayList
 *      底层数据结构式数组，查询快增删慢
 *      线程不安全，效率高
 *  2.Vector
 *      底层数据结构式数组，查询快增删慢
 *      线程安全，效率低
 *  3.LinkedList
 *      底层数据结构是链表，查询慢，增删快
 *      线程不安全，效率高
 *
 * 1.添加
 *  add(int index, Object obj) 在指定位置添加元素
 * 2.获取
 *  get(int index) 获取指定位置的元素
 * 3.列表迭代器
 *  listIterator() list集合特有的迭代器，可以实现逆向遍历，但是必须先正向遍历，所以一般不使用
 *      previous() 获取上一个元素
 *      hasPrevious()  判断是否有上一个元素
 * 4.删除
 *  Object remove(int index) 根据索引删除元素,返回被删除的元素
 * 5.修改
 *  Object set(int index, Object obj) 根据索引修改元素,返回被修改的元素
 */
class ListDemo {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        list.add(1, "muzi");
        System.out.println(list);

        /**
         * list集合的特有遍历功能
         * size() 和 get() 方法结合
         */
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------");
        /**
         * 列表迭代器: List集合特有的迭代器
         * 迭代器是依赖于集合存在的，在判断成功后，集合中新添加了元素，而迭代器却不知道，所以会报错，这个错误叫并发修改异常
         * 解决办法：
         *  1.迭代器迭代元素，迭代器修改元素
         *      元素是跟在刚才迭代的元素后面
         *  2.集合遍历元素，集合修改元素（普通for循环遍历）
         *      元素添加在集合最后
         */
        ListIterator lit = list.listIterator();
        while (lit.hasNext()) {
            if ("hello".equals(lit.next())) {
                lit.add("javaee");
            }
        }
        System.out.println("--------------");
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
    }
}
