package muzi.scrum.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by muzi on 2017/9/16.
 * 数组和集合的区别：
 * 1.长度区别
 *  数组的长度固定
 *  集合长度可变
 * 2.内容不同
 *  数组存储的是同一种类型的元素
 *  集合可以存储不同类型的元素
 * 3.元素的数据类型问题
 *  数组可以存储基本数据类型，也可以存储引用类型
 *  集合只能存储引用类型
 *
 *  Collection:
 *      集合的顶层接口，他的子体系有唯一的，有重复的，有有序的，有无序的
 *      功能：
 *          1.添加
 *              add(Object obj) 添加一个元素
 *              addAll(Collection c) 添加一个集合的元素
 *          2.删除
 *              clear() 移除所有元素
 *              remove(Object o) 移除一个元素
 *              removeAll(Collection c) 移除一个集合的元素
 *          3.判断
 *              contains(Object o) 是否包含指定的元素
 *              containsAll(Collection c) 是否包含指定的集合元素
 *              isEmpty() 判断集合是否为空
 *          4.获取
 *              Iterator<E> iterator()
 *          5.长度
 *              size() 元素个数
 *          6.交集
 *              boolean retainAll(collection c)
 *          7.把集合转换成数组
 *              Object[] toArray() 把集合转成数组，可以实现集合的遍历
 */
class CollectionDemo {

    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("world");
        c.add("java");
        System.out.println("add:" + c.add("hello"));
        //c.clear();
        //System.out.println("remove:" + c.remove("hello"));
        System.out.println("contains:" + c.contains("muzi"));
        System.out.println("size:" + c.size());
        Collection c2 = new ArrayList();
        c2.add("muzi");
        c2.add("wacai");
        c2.add("hello");
        //c.addAll(c2);
        //c.removeAll(c2);
        System.out.println("containsAll:" + c.containsAll(c2)); //只有包含所有的元素才叫包含
        //a对b做交集，最总的结果保存在a中，b不变，返回值表示a是否被更改
        System.out.println("retainAll():" + c.retainAll(c2));
        System.out.println("c:" + c);
        System.out.println("c2:" + c2);

        /**
         * 集合的遍历
         */
        Object[] objs = c2.toArray();
        for (int i = 0; i < objs.length; i++) {
            //System.out.println(objs[i]);
            //System.out.println(String.valueOf(objs[i]).length());
        }
        //while写法
        /*Iterator it = c2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }*/
        //for写法  for循环已结束，it对象就是垃圾了，可以被回收，性能好一点
        for (Iterator it = c2.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }

    }
}
