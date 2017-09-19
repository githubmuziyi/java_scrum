package muzi.scrum.generic;

/**
 * Created by muzi on 2017/9/18.
 * 泛型类
 */
class ObjectTool<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void show(T obj) {
        System.out.println(obj);
    }
}

class ObjectToolTest {
    public static void main(String[] args) {
        ObjectTool<String> ot = new ObjectTool<>();
        ot.setObj("muzi");
        String s = ot.getObj();
        System.out.println(s);

        ObjectTool<Integer> ot2 = new ObjectTool<>();
        ot2.setObj(22);
        Integer i = ot2.getObj();
        System.out.println(i);

        ObjectTool<Integer> ot3 = new ObjectTool<>();
        ot3.show(100);

        ObjectTool<Boolean> ot4 = new ObjectTool<>();
        ot4.show(true);
    }
}
