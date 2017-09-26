package muzi.scrum.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by muzi on 2017/9/24.
 * 异常中需要了解的几个方法：
 * 1.getMessage() 异常的消息串
 * 2.toString()  返回异常的简单信息描述
 * 3.printStackTrace() 获取异常类名和异常信息，以及异常出现的位置，返回值void，把信息输出在控制台
 *
 * 有些时候，我们是可以对异常进行处理的，但是有些时候，我们根本就没有权限或能力去处理某个异常，这时候我们就可以把这个问题抛出，交给调用者去处理
 * 通过 throws 抛出异常，尽量不要在main方法上抛出异常
 */
class ThrowsDemo {

    public static void main(String[] args) {
        System.out.println("muzi");
        /*String s = "2017-09-24";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = simpleDateFormat.parse(s);
            System.out.println(date);
        } catch (ParseException e) {
            //e.printStackTrace();
            System.out.println(e.toString());
        }*/
        try {
            method();
        } catch (ParseException e) {
            //e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("over");
    }

    public static void method() throws ParseException {
        String s = "2017-09-24";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        System.out.println(date);
    }
}
