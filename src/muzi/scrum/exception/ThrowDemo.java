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
 */
class ThrowDemo {

    public static void main(String[] args) {
        String s = "2017-09-24";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = simpleDateFormat.parse(s);
            System.out.println(date);
        } catch (ParseException e) {
            //e.printStackTrace();
            System.out.println(e.toString());
        }
        System.out.println("over");
    }
}
