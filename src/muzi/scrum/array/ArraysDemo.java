package muzi.scrum.array;

import java.util.Arrays;

/**
 * Created by muzi on 2017/9/15.
 * 针对数组进行操作的工具类，例如排序和查找
 * public static String toString(int[] a) 把数组转成字符串
 * public static void sort(int[] a) 对数组进行排序
 * public static int binarySearch(int[] a, int key) 二分查找
 */
class ArraysDemo {

    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13, 4, 98, 45};
        String s1 = Arrays.toString(arr);
        System.out.println(s1);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i = Arrays.binarySearch(arr, 45);
        System.out.println("i:" + i);
        System.out.println("i:" + Arrays.binarySearch(arr, 6));
    }
}
