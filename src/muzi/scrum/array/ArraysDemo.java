package muzi.scrum.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by muzi on 2017/9/15.
 * 针对数组进行操作的工具类，例如排序和查找
 * public static String toString(int[] a) 把数组转成字符串
 * public static void sort(int[] a) 对数组进行排序
 * public static int binarySearch(int[] a, int key) 二分查找
 *
 *
 * public static <T> List<T> asList(T... a) 把数组转成集合
 *     注意事项：
 *      虽然可以把数组转成集合，但是集合的长度不能变（add，remove操作不可用），本质上还是一个数组
 */
class ArraysDemo {

    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13, 4, 98, 45};
        String[] s = {"hello", "world"};
        String s1 = Arrays.toString(arr);
        System.out.println(s1);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i = Arrays.binarySearch(arr, 45);
        System.out.println("i:" + i);
        System.out.println("i:" + Arrays.binarySearch(arr, 6));
        List<String> list = Arrays.asList(s);
        List<String> lit2 = Arrays.asList("hello", "java");
        lit2.set(1, "mmzui");
        for (String x:
             list) {
            System.out.println(x);
        }
        for (String m:
             lit2) {
            System.out.println(m);
        }
    }
}
