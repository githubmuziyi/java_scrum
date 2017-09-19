package muzi.scrum.generic;

/**
 * Created by muzi on 2017/9/18.
 * 泛型接口:把泛型定义在接口上
 */
interface GenericInterface<T> {

    public abstract void show(T t);
}

/**
 * 已知类型
 */
class InterImpl implements GenericInterface<String> {

    @Override
    public void show(String s) {
        System.out.println(s);
    }
}

/**
 * 未知类型
 * @param <T>
 */
class InterImpl2<T> implements GenericInterface<T> {

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}

class InterTest {
    public static void main(String[] args) {
        GenericInterface<String> inter = new InterImpl();
        inter.show("hello");

        GenericInterface<String> inter2 = new InterImpl2<>();
        inter2.show("world");

        GenericInterface<Integer> inter3 = new InterImpl2<>();
        inter3.show(300);
    }
}
