package muzi.scrum.collection;

import java.util.Comparator;

/**
 * Created by muzi on 2017/9/21.
 */
class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int num = o1.getName().length() - o2.getName().length();
        int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
        return num2 == 0 ? o1.getAge() - o2.getAge() : num2;
    }
}
