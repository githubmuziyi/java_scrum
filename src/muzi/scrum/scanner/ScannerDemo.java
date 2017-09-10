package muzi.scrum.scanner;

import java.util.Scanner;

/**
 * Created by muzi on 2017/9/10.
 * Scanner:用于接受键盘输入数据
 */
class ScannerDemo {

    public static void main(String[] args) {
        /**
         * System类下有一个静态的字段：public static final InputStream in;  标准的输入流，对应着键盘输入
         */
        Scanner sc = new Scanner(System.in);
        /*int x = sc.nextInt();
        System.out.println("x:" + x);*/
        /**
         * hasNextXxx() 判断是否是某种类型的元素
         * nextXxx() 获取该元素
         */
        /*if (sc.hasNextInt()) {
            int y = sc.nextInt();
            System.out.println("y:" + y);
        } else {
            System.out.println("数据类型有误");
        }*/
        /**
         * 先获取一个数值，再获取一个字符串是会出现问题
         * 原因：换行符导致的
         * 解决办法：把所有数据都按照字符串类型获取，然后要什么就对应转换成什么类型
         */
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int z = Integer.parseInt(str1);
        System.out.println("a:" + z + "b:" + str2);
    }
}
