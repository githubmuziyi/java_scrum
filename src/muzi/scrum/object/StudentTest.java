package muzi.scrum.object;

/**
 * Created by muzi on 2017/9/10.
 */
class StudentTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 =  new Student("muzi", 24);
        Student s2 =  new Student("hewei", 25);
        Student s3 =  new Student("hewei", 25);
        /**
         * 返回对象的hashcode的值
         */
        System.out.println(s1.hashCode());
        /**
         * 获取运行时对象的类、获取类的名字
         */
        String str1 = s1.getClass().getName();
        System.out.println(str1);
        /**
         * 1.返回对象的字符串形式 等同于 s1.getClass().getName() + '@' + Integer.toHexString(s1.hashCode())
         * 2.toString()方法建议子类重写，输出更有意义的数据
         * 3.直接输出对象是默认调用toString方法
         */
        System.out.println(s1.toString());
        System.out.println(s1.getClass().getName() + '@' + Integer.toHexString(s1.hashCode()));
        System.out.println(s1);
        /**
         * 1.指示其他对象是否与此对象那个"相等",默认情况下比较的是地址值
         * 2.子类一般重写其方法
         * 3.自动生成
         */
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        /**
         * 用于垃圾回收，时间不确定   finalize()
         */

        /**
         * 1.创建返回此对象的副本
         * 2.Cloneable接口：标记接口，实现了该接口的的类才可以实现对象的复制
         */
        Object obj = s1.clone();
        Student s4 = (Student) obj;
        System.out.println(s4);
    }
}
