package muzi.scrum.biginteger;

import java.math.BigInteger;

/**
 * Created by muzi on 2017/9/16.
 * 可以让超过Integer的数据进行运算
 * 方法：
 * add(BigInteger val) 加法
 * subtract(BigInteger val) 减法
 * multiply(BigInteger val) 乘法
 * divide(BigInteger val) 除法
 * divideAndRemainder(BigInteger val) 商和余数的数组
 */
class BigIntegerDemo {

    public static void main(String[] args) {
        Integer i = new Integer(String.valueOf(Integer.MAX_VALUE));
        System.out.println(i);
        //Integer i2 = new Integer("2147483648");  //超出int范围
        //System.out.println(i2);
        BigInteger bi = new BigInteger("2147483648");
        System.out.println(bi);
    }
}
