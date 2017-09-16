package muzi.scrum.Regex;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by muzi on 2017/9/16.
 * 正则表达式
 * \d [0-9]
 * \D [^0-9]
 * \w [a-zA-Z_0-9]
 * \W [^\w]
 * \s [\t\n\xOB\f\r] 空白字符
 * \S [^\s] 非空白字符
 * ^ 行的开头
 * $ 行的结尾
 * \b 单词边界(不是单词字符的地方)
 * ? 0次或一次
 * * 0次或多次
 * + 一次或多次
 * {n} n次
 * {n,} 至少n次
 * {n,m} n到m次
 *
 * 功能：
 *  判断功能 matches(String regex)
 *  分割功能 split(String regex)
 *  替换功能 replaceAll(String regex, String str)
 */
class RegexDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input Mail:");
        String qq = sc.nextLine();
        System.out.println(checkMail(qq));
        //split 分割
        String ages = "18-24";
        String regex = "-";
        System.out.println("age:" + Arrays.toString(ages.split(regex)));
        String s1 = "a.b.c";
        System.out.println(Arrays.toString(s1.split("\\.")));
        String s2 = "a   b         c";
        System.out.println(Arrays.toString(s2.split(" +")));
        String s3 = "E:\\mu\\zi\\he\\low";
        System.out.println(Arrays.toString(s3.split("\\\\")));
        //替换
        String s4 = "hello133mhzu23423jjk34234";
        System.out.println(s4.replaceAll("\\d", "*"));
    }

    /**
     * 判断qq号
     * @param qq
     * @return
     */
    public static boolean checkQQ(String qq) {
        return qq.matches("[1-9][0-9]{4,14}");
    }

    public static boolean checkTel(String tel) {
        String regex = "1[38]\\d{9}";
        return tel.matches(regex);
    }

    public static boolean checkMail(String mail) {
        String regex = "\\w+@[\\da-zA-Z]{2,6}(\\.[a-zA-Z]{2,3})+";
        return mail.matches(regex);
    }
}
