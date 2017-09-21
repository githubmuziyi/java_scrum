package muzi.scrum.collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by muzi on 2017/9/21.
 * TreeSet: 能够对元素进行排序，按照某种规则进行排序
 *  1.自然排序
 *  2.比较器排序
 *
 *  TreeSet底层是红黑树结构（红黑树是一种自平衡的二叉树）
 */
class TreeSetDemo {

    public static void main(String[] args) {

        /**
         * 自然排序（无参构造）
         */
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(20);
        ts.add(18);
        ts.add(23);
        ts.add(22);
        ts.add(17);
        ts.add(24);
        ts.add(18);

        for (Integer i:
             ts) {
            System.out.println(i);
        }

        /**
         * 自然排序（自定义对象）
         * 1.自然排序，按照年龄从小到大排序
         * 2.成员变量相同即为同一元素
         */
        TreeSet<Student> ts2 = new TreeSet<>();
        Student s1 = new Student("muzi", 27);
        Student s2 = new Student("jaja", 22);
        Student s3 = new Student("liuzi", 22);
        Student s4 = new Student("muzi", 27);
        ts2.add(s1);
        ts2.add(s2);
        ts2.add(s3);
        ts2.add(s4);

        for (Student s:
             ts2) {
            System.out.println(s);
        }
        System.out.println("------------------");
        /**
         * 比较器排序
         */
        TreeSet<Student> ts3 = new TreeSet<>(new MyComparator());
        ts3.add(s1);
        ts3.add(s2);
        ts3.add(s3);
        ts3.add(s4);
        for (Student s:
             ts3) {
            System.out.println(s);
        }

        /**
         * 匿名内部类实现
         */
        TreeSet<Student> ts4 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getName().length() - o2.getName().length();
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                return num2 == 0 ? o1.getAge() - o2.getAge() : num2;
            }
        });
    }
}
