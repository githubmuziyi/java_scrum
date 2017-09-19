package muzi.scrum.generic;

/**
 * Created by muzi on 2017/9/18.
 * 泛型方法：把泛型定义在方法上
 */
class GenericFunction {

    public <T> void show(T t) {
        System.out.println(t);
    }
}

class GenericFunctionTest {
    public static void main(String[] args) {
        GenericFunction gf = new GenericFunction();
        gf.show("hello");
        gf.show(100);
        gf.show(true);
    }
}
