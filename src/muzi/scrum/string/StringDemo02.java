package muzi.scrum.string;

/**
 * Created by muzi on 2017/9/12.
 * String类的获取功能：
 * int length() :获取字符串的长度
 * char charAt(int index) :获取指定索引位置的字符
 * int indexOf(int chr) :返回指定字符在此字符串中第一次出现的位置
 * int indexOf(String str) :返回指定字符串在此字符串中第一次出现的位置
 * int indexOf(int ch, int fromIndex) :返回指定字符在此字符串中从指定位置后第一次出现的位置
 * int indexOf(String str, int fromIndex)
 * String substring(int start) ：从指定位置开始截取字符串，默认到末尾
 * String substring(int start, int end)
 */
class StringDemo02 {

    public static void main(String[] args) {
        String s = "helloworld";
        System.out.println("s.length:" + s.length());
        System.out.println("s.charAt:" + s.charAt(7));
        System.out.println("s.indexOf:" + s.indexOf("l"));
        System.out.println("s.indexOf:" + s.indexOf("owo"));
        System.out.println("s.indexOf:" + s.indexOf("l", 4));
        System.out.println("s.substring:" + s.substring(4));
        System.out.println("s.substring:" + s.substring(3, 8));
        System.out.println("s:" + s);
    }
}
