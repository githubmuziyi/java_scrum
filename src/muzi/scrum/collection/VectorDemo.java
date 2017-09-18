package muzi.scrum.collection;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by muzi on 2017/9/17.
 * Vector的特有功能
 * 1.添加功能
 *  addElement(Object obj)
 * 2.获取功能
 *  elementAt(int index)
 *  public Enumeration elements()
 */
class VectorDemo {

    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("hello");
        v.addElement("world");
        v.addElement("java");

        for (int i = 0; i < v.size(); i++) {
            String s  = (String) v.elementAt(i);
            System.out.println(s);
        }

        System.out.println("------------");

        Enumeration en = v.elements();
        while (en.hasMoreElements()) {
            String s = (String) en.nextElement();
            System.out.println(s);
        }
    }
}
