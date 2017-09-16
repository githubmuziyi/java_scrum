package muzi.scrum.random;

import java.util.Random;

/**
 * Created by muzi on 2017/9/16.
 * 此类同于产生随机数
 * Random() 默认种子，当前时间的毫秒值
 * Random(long seed) 指定种子,指定种子后，每次得到的随机数是相同的
 * nextInt() 返回int范围内的随机数
 * nextInt(int n) 返回[0,n)范围内的随机数
 */
class RandomDemo {

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            //System.out.println(r.nextInt());
            //System.out.println(r.nextInt(100));
        }
        Random r2 = new Random(1111);
        for (int i = 0; i < 10; i++) {
            System.out.println(r2.nextInt(100));
        }
    }
}
