package muzi.scrum.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by muzi on 2017/10/6.
 * JAVA反射
 * 通过class文件对象去使用该文件中的成员属性，成员方法，构造方法
 *
 * 要想这样使用，首先要拿到class文件的对象
 * Class类：
 *  成员属相 Field
 *  构造方法 Constructor
 *  成员方法 Method
 *
 * 获取Class文件对象的方式：
 *  1.Object 类的getClass() 方法
 *  2.数据类型的静态属相
 *  3.Class类中的静态方法 (带包名的全路径)
 *      forName(String className)
 *
 * 一般使用第三种
 */
class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Person person = new Person();
        //方式1
        Class c = person.getClass();
        //方式2
        Class c1 = Person.class;
        //方式3 推荐
        Class c2 = Class.forName("muzi.scrum.reflect.Person");

        /**
         * 通过反射获取构造方法并使用
         * getConstructors() //获取全部公共构造方法
         * getDeclaredConstructors() //获取全部构造方法
         */
        Class personClass = Class.forName("muzi.scrum.reflect.Person");
        Constructor[] constructors = personClass.getConstructors();
        for (Constructor con:
             constructors) {
            System.out.println(con);
        }
        Constructor[] constructors1 = personClass.getDeclaredConstructors();
        for (Constructor con:
             constructors1) {
            System.out.println(con);
        }
        /**
         * 获取单个构造方法
         * 初始化实例
         */
        Constructor constructor = personClass.getConstructor();
        Object object = constructor.newInstance();
        Constructor constructor1 = personClass.getConstructor(String.class, int.class, String.class);
        Object object1 = constructor1.newInstance("muzi", 24, "beijing");
        //私有构造
        Constructor constructor2 = personClass.getDeclaredConstructor(String.class);
        constructor2.setAccessible(true); //取消访问权限检查
        Object object2 = constructor2.newInstance("mumuzi");

        /**
         * 获取成员变量
         */
        Field field = personClass.getField("address");
        Field field1 = personClass.getDeclaredField("name");
        field.set(object, "北京");
        field1.setAccessible(true);
        field1.set(object, "挖财");
        System.out.println(object);

        /**
         * 获取成员方法并使用
         * getMethods() 获取自己和父类所有的公开方法
         */
        Method method = personClass.getMethod("show");
        method.invoke(object);
        Method method1 = personClass.getMethod("method", String.class);
        method1.invoke(object, "hahha");
        Method method2 = personClass.getDeclaredMethod("function");
        method2.setAccessible(true);
        method2.invoke(object);
    }
}
