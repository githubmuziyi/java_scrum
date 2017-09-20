package muzi.scrum.generic;

/**
 * Created by muzi on 2017/9/18.
 * 泛型方法：把泛型定义在方法上
 * 静态方法的泛型
 * public static <T> T function(T t)
 */
class GenericFunction {

    public <T> T show1(T t) {
        return t;
    }
    public <T> void show2(T t) {
        System.out.println(t);
    }
}

class GenericFunctionTest {
    public static void main(String[] args) {
        GenericFunction gf = new GenericFunction();
        System.out.println(gf.show1("hello"));
        gf.show2(100);
        gf.show2(true);
    }
}
