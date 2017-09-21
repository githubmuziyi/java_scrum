package muzi.scrum.collection;

import java.util.HashSet;

/**
 * Created by muzi on 2017/9/20.
 */
class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("hello");

        for (String s:
             hs) {
            System.out.println(s);
        }

        Student s1 = new Student("muzi", 12);
        Student s2 = new Student("haha", 23);
        Student s3 = new Student("muzi", 12);

        HashSet<Student> hs2 = new HashSet<>();
        hs2.add(s1);
        hs2.add(s2);
        hs2.add(s3);
        for (Student u:
             hs2) {
            System.out.println(u);
        }
    }
}
