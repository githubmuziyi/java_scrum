package muzi.scrum.math;

import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * Created by muzi on 2017/9/16.
 * 成员变量：
 *  public static final double PI
 *  public static final double E
 * 成员方法：
 *  abs(int i) 绝对值
 *  ceil(double d) 向上取整
 *  floor(double d) 向下取整
 *  max（int a, int b）
 *  pow(double a, double b) a的b次幂
 *  random() 随机数【0.0 1.0）
 *  round(float a) 四舍五入
 *  sqrt(double a) 正平方根
 */
class MathDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始数字：");
        int start = sc.nextInt();
        System.out.println("请输入结束数字:");
        int end = sc.nextInt();
        System.out.println(getRandom(start, end));
    }

    public static int getRandom(int start, int end) {
        return (int) (Math.random()*(end - start + 1)) + start;
    }
}
