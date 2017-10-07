package muzi.scrum.collection;

/**
 * Created by muzi on 2017/9/19.
 * 静态导入
 * 格式： import static 包名.类名.方法名
 * 可以直接导入到方法的级别
 * 注意事项：
 *  1.方法必须是静态的
 *  2.如果用多个同名的静态方法，容易不知道使用谁，这个时候必须加前缀
 */

import static java.lang.Math.abs;

class StaticImportDemo {

    public static void main(String[] args) {
        System.out.println(abs(-100));
        System.out.println(Math.pow(2, 3));
        System.out.println(java.lang.Math.max(3, 10));
        System.out.println(max(1, 2));
    }

    public static Integer max(Integer i, Integer j) {
        return i;
    }
}
