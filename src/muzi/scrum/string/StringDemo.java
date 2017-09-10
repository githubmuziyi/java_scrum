package muzi.scrum.string;

/**
 * 1.字符串字面值"abc"可以看做是一个字符串对象
 * 2.字符串是常量，一旦被赋值，就不能改变
 * Created by muzi on 2017/9/10.
 */
class StringDemo {

    public static void main(String[] args) {
        String str1 = "abc";
        System.out.println(str1);
        /**
         * 构造方法:
         * 1. public String()
         * 2. public String(byte[] bytes):吧字节数组转换成字符串
         * 3. public String(byte[] bytes, int index, int length):吧字节数组的一部分转换成字符串
         * 4. public String(char[] value)
         * 5. public String(char[] value, int index, int count)
         * 6. public String(String original): 把字符串常量转换成字符串 意义不大
         */
        String s1 = new String();
        System.out.println("s1:" + s1);
        System.out.println("s1.length():" + s1.length());

        byte[] bys = {99, 100, 101, 102};
        String s2 = new String(bys);
        System.out.println("s2:" + s2);
        System.out.println("s2.length():" + s2.length());

        char[] chs = {'a', 'b', 'c', '和', '没'};
        String s3 = new String(chs);
        System.out.println("s3:" + s3);
        System.out.println("s3.length():" + s3.length());

        String s4 = new String(chs, 1, 3);
        System.out.println("s4:" + s4);
        System.out.println("s4.length():" + s4.length());

        /**
         * String s = new String("hello")
         * String s = "hello"
         * 区别：
         *  前者会创建两个对象，后者会创建一个对象。
         */
        String s5 = new String("hello");
        String s6 = "hello";
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));
        /**
         * 字符创如果是变量相加，先开空间，再拼接
         * 字符串如果是常量相加，先相加，然后在常量池里面找，如果有就直接返回，否则就创建
         */
        String s7 = "hello";
        String s8 = "world";
        String s9 = "helloworld";
        System.out.println(s9 == s7 + s8);
        System.out.println(s9 == "hello" + "world");
        /**
         * String类的判断功能
         * boolean equals(Object obj) :比较字符串的内容是否相等，区分大小写
         * boolean equalsIgnoreCase(String str): 比较字符串的内容是否相同，忽略大小写
         * boolean contains(String str):判断大字符串中是否包含小字符串
         * boolean startsWith(String str):
         * boolean endsWith(String str): 判断字符串是否以某个制定的字符串结尾
         * Boolean isEmpty(String str):判断字符串是否为空
         */
        System.out.println("contains:" + s9.contains("hello"));
        System.out.println("contains:" + s9.contains("hw"));
        System.out.println("startsWith:" + s9.startsWith("h"));

    }
}
