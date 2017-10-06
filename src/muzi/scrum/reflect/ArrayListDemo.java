package muzi.scrum.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by muzi on 2017/10/6.
 * 在ArrayList<Integer> 集合中加入字符串对象，怎么做？
 *
 * 可以通过反射实现：
 *  因为泛型是针对于编译器做的声明规范，在对象变为class文件对象后泛型的约束其实是不存在的已经
 */
class ArrayListDemo {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //直接添加字符串会出现变异错误 arrayList.add("hello");
        //通过反射直接操作class文件可以实现
        Class arrayListClass = arrayList.getClass();
        Method method = arrayListClass.getMethod("add", Object.class);
        method.invoke(arrayList, "hello");
        method.invoke(arrayList, "world");
        method.invoke(arrayList, "java");
        System.out.println(arrayList);
    }
}
