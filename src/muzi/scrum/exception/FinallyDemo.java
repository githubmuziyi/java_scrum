package muzi.scrum.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by muzi on 2017/9/25.
 * finally:被finally控制的语句体一定会执行
 * 作用：
 *  用于释放资源，在IO流操作和数据库造作中会常见
 *
 *
 *  final: 修饰类（类不能被继承），修饰变量（常量），修饰成员方法（方法不能被重写）
 *  finally: 异常处理的一部分
 *  finalize: Object类的一个方法，用于垃圾回收
 */
class FinallyDemo {

    public static void main(String[] args) {
        String s = "2017-09-24";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            System.out.println("这里的代码是可以执行的");
        }
        System.out.println(date);
        getInt();
    }

    public static int getInt() {
        int a = 10;
        try {
            System.out.println(a/0);
            a = 20;
        } catch (ArithmeticException ae) {
            a = 30;
            return a;
        } finally {
            a = 40;
        }
        return a;
    }
}
