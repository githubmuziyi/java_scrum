package muzi.scrum.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/**
 * Created by muzi on 2017/9/17.
 */
class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add("hello");
        array.add("world");
        array.add("java");
        ListIterator lit = array.listIterator();
        while (lit.hasNext()) {
            String s = (String) lit.next();
            System.out.println(s);
        }
        System.out.println("-----------");
        for (int i = 0; i < array.size(); i++) {
            String s = (String) array.get(i);
            System.out.println(s);
        }
        System.out.println("-----------");
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("java");
        //去除重复的集合元素
        System.out.println(array);
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i).equals(array.get(j))) {
                    array.remove(j);
                    j--;
                }
            }
        }
        System.out.println(array);
        ArrayList<Integer> i = new ArrayList<>();
        Integer[] iArr = new Integer[3];
        i.add(10);
        i.add(20);
        i.add(30);
        Integer[] ss = i.toArray(iArr);
        System.out.println(iArr);
        System.out.println(ss);
        Arrays.sort(iArr);
        System.out.println("max:----" + iArr[iArr.length - 1]);
        for (Integer iii:
             ss) {
            System.out.println(iii);
        }

        /**
         * 集合的嵌套遍历
         */
        //创建大集合
        ArrayList<ArrayList<Student>> bigArr = new ArrayList<>();
        ArrayList<Student> firstArr = new ArrayList<>();
        Student s1 = new Student("muzi", 20);
        Student s2 = new Student("muzii", 23);
        Student s3 = new Student("muziii", 25);
        firstArr.add(s1);
        firstArr.add(s2);
        firstArr.add(s3);
        ArrayList<Student> secArr = new ArrayList<>();
        Student s4 = new Student("wacai", 20);
        Student s5 = new Student("wacai1", 23);
        Student s6 = new Student("wacai2", 25);
        secArr.add(s4);
        secArr.add(s5);
        secArr.add(s6);
        bigArr.add(firstArr);
        bigArr.add(secArr);
        for (ArrayList<Student> arrays:
             bigArr) {
            for (Student s:
                 arrays) {
                System.out.println(s);
            }
        }
    }
}
