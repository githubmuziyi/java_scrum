package muzi.scrum.io;

import java.io.*;

/**
 * Created by muzi on 2017/10/2.
 * 序列化流：把对象按照流一样的方式存入文本文件或在网络中传输 ObjectOutputStream
 * 反序列化流：把文本文件中的流对象的数据或者网络中的流对象的数据还原为对象 ObjectInputStream
 */
class ObjectOutputStreamDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //write();
        read();
    }

    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./testdir/oos.md"));
        Object obj = ois.readObject();
        ois.close();
        System.out.println(obj);
    }

    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./testdir/oos.md"));
        Person person = new Person("muzi", 25);
        oos.writeObject(person);
        oos.close();
    }
}

class Person implements Serializable {
    /**
     * 1.看到类实现了序列化接口，可以产生一个序列化id值，产生这个值以后，我们对类的任何修改，他都可以读取以前的数据
     * 2。使用transient关键字声明不需要序列化的成员变量
     */
    private static final long serialVersionUID = -201708091123L;
    private String name;
    private transient int age;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
