package muzi.scrum.bigdecimal;

import java.math.BigDecimal;

/**
 * Created by muzi on 2017/9/16.
 * 由于在运算时候，float和double很容易丢失精度，所以为了能精确的表示计算浮点数，java提供了BigDecimal
 * 构造方法:
 *  BigDecimal(String val)
 */
class BigDecimalDemo {

    public static void main(String[] args) {
        System.out.println(0.09 + 0.01);
        System.out.println(1.0 - 0.32);
        BigDecimal db1 = new BigDecimal("0.01");
        BigDecimal db2 = new BigDecimal("0.09");
        System.out.println("decimal:" + db1.add(db2));
        System.out.println(db2.subtract(db1));
        System.out.println(db1.multiply(db2));
        System.out.println(db2.divide(db1));
        System.out.println(db2.divide(db1, 8, BigDecimal.ROUND_HALF_UP));
    }
}
