package muzi.scrum.reflect;

/**
 * Created by muzi on 2017/10/6.
 */
class Person {

    private String name;
    int age;
    public String address;

    public Person() {}

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void show() {
        System.out.println("show");
    }

    public void method(String name) {
        System.out.println("method" + name);
    }

    public String getString(String s, int i) {
        return s + i;
    }

    private void function() {
        System.out.println("function");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
