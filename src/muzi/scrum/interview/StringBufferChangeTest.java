package muzi.scrum.interview;


/**
 * 很多要这个时候要问了：StringBuffer创建的明明也是对象，那为什么输出结果依然是原来的值呢？
 *
 * 因为在change1方法内部我们是新建了一个StringBuffer对象，所以str指向了另外一个地址，相应的操作也同样是指向另外的地址的。
 */
public class StringBufferChangeTest {

    public static void main(String[] args) {
        StringBufferChangeTest.method1();
    }

    public static void method1() {
        StringBuffer str = new StringBuffer("公众号：Java面试通关手册");
        System.out.println(str);
        change1(str);
        System.out.println(str);
    }

    public static void change1(StringBuffer str) {
        str = new StringBuffer("abc");//输出：“公众号：Java面试通关手册”
        //str.append("欢迎大家关注");//输出：公众号：Java面试通关手册欢迎大家关注
        //str.insert(3, "(编程)");//输出：公众号(编程)：Java面试通关手册

    }
}
