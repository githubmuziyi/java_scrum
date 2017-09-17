package muzi.scrum.objectarray;

/**
 * Created by muzi on 2017/9/16.
 */
class ObjectArrayDemo {

    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student stu1 = new Student("muzi1", 21);
        Student stu2 = new Student("muzi2", 22);
        Student stu3 = new Student("muzi3", 23);
        Student stu4 = new Student("muzi4", 24);
        Student stu5 = new Student("muzi5", 25);

        students[0] =stu1;
        students[1] =stu2;
        students[2] =stu3;
        students[3] =stu4;
        students[4] =stu5;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
