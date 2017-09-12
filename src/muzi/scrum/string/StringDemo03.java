package muzi.scrum.string;

/**
 * Created by muzi on 2017/9/12.
 * String 的转换功能：
 * byte[] getBytes() 把字符串转换成字节数组
 * char[] toCharArray() 把字符串转换成字符数组
 * static String valueOf(char[] chs)  把字符数组转换成字符串
 * static String valueOf(int i) 把int类型的数据转换成字符串
 * String toLowerCase() 把字符串转成小写
 * String toUpperCase() 把字符串转成大写
 * String concat(String str) 把字符串拼接
 * String 的其他功能
 * String replace(char old, char new) 替换
 * String replace(String old, String new)
 * String trim()
 * int compareTo(String str) 按字典顺序比较两个字符串
 * int compareToIgnoreCase(String str)
 *
 */
class StringDemo03 {

    public static void main(String[] args) {
        String s = "HelloWorld";
        byte[] bys = s.getBytes();
        for (int i = 0; i < bys.length; i++) {
            System.out.println(bys[i]);
        }
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        String ss = String.valueOf(chs);
        System.out.println("ss:" + ss);
        int s2 = 100;
        String.valueOf(s2);
        System.out.println("s2:" + s2);
        System.out.println("LowerCase:" + s.toLowerCase());
        System.out.println("toUpperCase:" + s.toUpperCase());
        System.out.println("concat:" + s.concat("mumuzi"));
        String s3 = s.replace('e', 'E');
        System.out.println("ss:" + s3);
        String s4 = s.replace("oWo", "muzi");
        System.out.println("s4:" + s4);
    }
}
