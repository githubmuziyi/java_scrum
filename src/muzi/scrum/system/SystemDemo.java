package muzi.scrum.system;

import java.util.Arrays;

/**
 * Created by muzi on 2017/9/16.
 * System包含一些有用的类字段和方法，他不能被实例化
 * gc()  运行垃圾回收器  不要在程序中频繁的调用垃圾回收，每次执行垃圾回收，jvm都会强制启动回收器运行，这会与正常的java程序进行争抢资源
 * exit(int status) 终止正在运行的java虚拟机，非0状态表示异常终止
 * currentTimeMillis() 返回毫秒为单位的当前时间 应用：统计运行时间
 * arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 数组复制
 */
class SystemDemo {

    public static void main(String[] args) {
        Person p = new Person("muzi", 24);
        System.out.println("P:" + p);
        p = null;
        System.gc();
        System.out.println(System.currentTimeMillis());
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr2 = {6, 7, 8, 9, 10, 11};
        System.arraycopy(arr, 1, arr2, 2, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
