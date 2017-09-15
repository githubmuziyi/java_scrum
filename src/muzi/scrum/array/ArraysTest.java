package muzi.scrum.array;

import java.util.Arrays;

/**
 * Created by muzi on 2017/9/15.
 */
class ArraysTest {

    public static void main(String[] args) {
        String s = "dsfasdhfk";
        char[] ch = s.toCharArray();
        //BubbleSort(ch);
        Arrays.sort(ch);
        System.out.println("s:" + String.valueOf(ch));
    }

    public static void BubbleSort(char[] arr) {
        for (int j = arr.length; j > 1; j--) {
            for (int i = 0; i < j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    char tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
    }
}
