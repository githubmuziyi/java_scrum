package muzi.scrum.exception;

/**
 * Created by muzi on 2017/9/25.
 * throw:如果出现了异常情况，我们可以把该异常抛出，这个时候抛出的应该是异常对象
 *
 *
 *throws 和 throw的区别：
 *  throws:
 *      用在方法声明后面，跟的是异常类名
 *      可以跟多个异常类名，用逗号隔开
 *      表示抛出异常，由该方法的调用者进行处理
 *      throws表示出现异常的一种可能性，并不一定会发生这个异常
 *  throw：
 *      用在方法体内，跟的是异常对象
 *      只能抛出一个异常对象
 *      表示抛出异常，由方法体内的语句处理
 *
 *      后续程序需要继续运行就try
 *      后续程序不需要继续运行就throws
 */
class ThrowDemo {

    public static void main(String[] args) {
        method();
        try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method() {
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new ArithmeticException();
        } else {
            System.out.println(a/b);
        }
    }

    public static void method2() throws Exception {
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new Exception();
        } else {
            System.out.println(a/b);
        }
    }
}
