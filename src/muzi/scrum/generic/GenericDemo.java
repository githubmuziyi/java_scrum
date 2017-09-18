package muzi.scrum.generic;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by muzi on 2017/9/17.
 * String[] strArray = new String[3];
 * strArray[0] = "hello";
 * strArray[1] = "world";
 * strArray[2] = 10; //报错
 * 集合也模仿数组的这种做法，在创建对象的时候明确元素的数据类型，这样就不会有问题
 * 这种技术被称为：泛型
 *
 * 泛型：是一种特殊的类型，把类型明确的工作推迟到创建对象或者调用方法的时候才去明确的。
 *
 * 格式：
 *  <数据类型> 只能是引用类型
 *
 * 好处：
 *  a.把运行期间的问题提前到了编译期间
 *  b.避免的强制类型转换
 */
class GenericDemo {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");
        //array.add(new Integer(100));
        //array.add(10);//JDK5以后的自动装箱  等价于 array.add(Integer.valueOf(10))

        ListIterator<String> lit = array.listIterator();
        while (lit.hasNext()) {
            String s = lit.next();
            System.out.println(s);
        }
    }
}
