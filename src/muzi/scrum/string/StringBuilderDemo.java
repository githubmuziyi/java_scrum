package muzi.scrum.string;

/**
 * Created by muzi on 2017/9/14.
 * StringBuilder是不同步的，数据不安全，效率高
 * 注意：
 *  String作为形参传递，效果和基本类型作为参数传递一样
 */
class StringBuilderDemo {


    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 + "-----" + s2);
        change(s1, s2);
        System.out.println(s1 + "-----" + s2);
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("world");
        System.out.println(sb1 + "----" +sb2);
        change(sb1, sb2);
        System.out.println(sb1 + "----" + sb2);
    }

    public static void change(String s1, String s2) {
        s1 = s2;
        s2 += s1;
    }

    public static void change(StringBuffer sb1, StringBuffer sb2) {
        sb1 = sb2;
        sb2.append(sb1);
    }

}
