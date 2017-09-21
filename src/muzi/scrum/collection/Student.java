package muzi.scrum.collection;

/**
 * Created by muzi on 2017/9/10.
 * 如果一个类的元素想要能够自然排序，就必须实现自然排序接口Comparable
 */
class Student implements Cloneable, Comparable<Student> {

    private String name = null;
    private int age = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name.equals(student.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    /*@Override
    public boolean equals(Object obj) {
        //优化
        if (this == obj) {
            return true;
        }
        if (obj instanceof Student) {
            Student s = (Student) obj;
            return this.name.equals(s.name) && this.age == s.age;
        } else {
            return false;
        }

    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Student o) {
        //根据排序规则
        int num =  this.age - o.age;
        return num == 0 ? this.name.compareTo(o.name) : num;
    }
}
