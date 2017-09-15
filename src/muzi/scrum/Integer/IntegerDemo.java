package muzi.scrum.Integer;

import org.omg.CORBA.INTERNAL;

import java.util.Iterator;

/**
 * Created by muzi on 2017/9/15.
 * 为了对基本类型进行更多操作，更方便的操作，Java针对每一种基本类型都提供了对应的类类型，包装类类型
 * byte  Byte
 * short Short
 * int Integer
 * long Long
 * float Float
 * double Double
 * char Character
 * boolean Boolean
 * 用于基本数据类型与字符串之间的转换
 */
class IntegerDemo {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(100));//二进制
        System.out.println(Integer.toOctalString(100));//八进制
        System.out.println(Integer.toHexString(100));//十六进制
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //十进制转其他进制
        System.out.println(Integer.toString(100, 2));//转2进制
        System.out.println(Integer.toString(100, 8));
        System.out.println(Integer.toString(100, 16));

        //其他进制转十进制
        System.out.println(Integer.parseInt("1111111", 10));
        System.out.println(Integer.parseInt("1111111", 2));
        System.out.println(Integer.parseInt("1111111", 8));

        Integer i = 100;
        i += 200;
        System.out.println("i:" + i);

        //反编译代码
        Integer ii = Integer.valueOf(100);
        ii = Integer.valueOf(ii.intValue() + 200);
        System.out.println((new StringBuffer("ii:")).append(ii).toString());

        /**
         * 针对-128到127之间的数据，做了一个数据缓冲池，如果数据是该范围，每次并不创建新空间
         */
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));
    }
}
