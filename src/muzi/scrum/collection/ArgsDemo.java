package muzi.scrum.collection;

/**
 * Created by muzi on 2017/9/19.
 * 可变参数
 * 注意：
 *  1.这里的可变参数变量其实是一个数组
 *  2.如果一个方法有可变参数，并且有多个参数，那么可变参数肯定是最后一个
 */
class ArgsDemo {

    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int k = 4;
        int result2 = sum(i, j, k);
        int result = sum(i, j);
        int s3 = sum(i, j, 4, 5);
        System.out.println(s3);
        System.out.println(result);
    }

    private static int sum(int i, int j, int k) {
        return i + j +k;
    }

    private static int sum(int i, int j) {
        return i + j;
    }

    //可变参数
    private static int sum(int... a) {
        int result = 0;
        for (int x:
             a) {
            result += x;
        }
        return result;
    }
}
