package muzi.scrum.generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by muzi on 2017/9/18.
 * 泛型通配符
 * ? extends E
 * ? super E
 */
class GenericExtends {
    public static void main(String[] args) {
        //泛型如果明确写的时候，前后必须一致
        Collection<Object> c1 = new ArrayList<>();
        /*Collection<Object> c2 = new ArrayList<Animal>(); //报错
        Collection<Object> c3 = new ArrayList<Dog>();
        Collection<Object> c4 = new ArrayList<Cat>();*/

        // ? 表示任意的类型都是可以的
        Collection<?> c2 = new ArrayList<Animal>();
        Collection<?> c3 = new ArrayList<Dog>();

        // ? extends E 向下限定，E及其子类
        Collection<? extends Animal> c4 = new ArrayList<Cat>();
        //Collection<? extends Animal> c5 = new ArrayList<Object>(); //报错


        // ? super E 向上限定，E及其父类
        Collection<? super Animal> c7 = new ArrayList<Object>();
        //Collection<? super Animal> c6 = new ArrayList<Dog>(); //报错
    }
}

class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}
