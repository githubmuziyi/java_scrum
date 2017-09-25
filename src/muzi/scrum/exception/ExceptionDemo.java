package muzi.scrum.exception;

/**
 * Created by muzi on 2017/9/24.
 * 程序的异常：
 *  严重问题：Error
 *  问题：Exception
 *      编译期问题: 非RuntimeException的异常 Java程序必须显示处理，否则程序就会发生错误，无法编译通过
 *      运行期问题：RuntimeException 无需显示处理，也可以和编译时异常一样处理
 * 如果程序出现问题我们没有做处理，jvm虚拟机会做默认处理
 *
 * 自己处理异常：
 *  1.try...catch...finally
 *      try里面的代码越少越好
 *      catch里面必须有内容，哪怕是一个简单的提示
 *  2.throws 抛出
 *
 *  JDK7出现了一个新的异常处理方案
 *      try{
 *
 *      } catch(异常名1 | 异常名2 | 异常名3) {
 *
 *      }
 */
class ExceptionDemo {

    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        method5();
    }

    public static void method1() {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a/b);
        } catch (ArithmeticException ae) {
            System.out.println("除数不能为0");
        }
        System.out.println("over");
    }

    public static void method2() {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.out.println("除数不能为0");
        }
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界");
        }
        System.out.println("over");
    }

    public static void method3() {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(a/b);
            System.out.println(arr[5]);
        } catch (ArithmeticException ae) {
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界");
        }
        System.out.println("over");
    }

    public static void mathod4() {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(a/b);
            System.out.println(arr[5]);
            System.out.println("????");
        } catch (ArithmeticException ae) {
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界");
        } catch (Exception e) {
            System.out.println("出问题了");
        }
        System.out.println("over");
    }

    public static void method5() {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(a/b);
            System.out.println(arr[5]);
            System.out.println("????");
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("出问题了");
        }
        System.out.println("over");
    }
}
