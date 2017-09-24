package muzi.scrum.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by muzi on 2017/9/23.
 * 针对集合操作的工具类,都是静态方法
 * Collection 和 Collections的区别
 *  Collection: 是单列集合的顶层接口，有子接口List和Set
 *  Collections: 是针对集合操作的工具类，有对集合进行排序和二分查找的方法
 *
 *  常用方法：
 *      sort(List<T> list) 默认情况下是自然排序
 *      binarySearch(List<?> list, T key) 二分查找
 *      max(Collection<?> coll) 最大值
 *      reverse(List<?> list) 反转
 *      shuffle(List<?> list) 随机置换
 */
class CollectionsDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(15);
        list.add(8);

        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, 15));
        System.out.println(Collections.binarySearch(list, 205));
        System.out.println(Collections.max(list));
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
