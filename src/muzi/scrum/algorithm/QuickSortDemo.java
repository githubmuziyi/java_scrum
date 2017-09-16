package muzi.scrum.algorithm;

import java.util.Arrays;

/**
 * Created by muzi on 2017/9/16.
 */
class QuickSortDemo {
    public static void main(String[] args) {
        int[] s = {34,65,13,1,78,45,97,33,562,4,6,44,5};
        quickSort(s, 0, s.length - 1);
        System.out.println("s:" + Arrays.toString(s));
    }

    public static int position(int s[], int start, int end) {
        int i = start, j = end;
        int x = s[i];
        while (i < j) {
            while (i < j && s[j] >= x)
                j--;
            if (i < j) {
                s[i] = s[j];
                i++;
            }
            while (i < j && s[i] < x)
                i++;
            if (i < j) {
                s[j] = s[i];
                j--;
            }
        }
        s[i] = x;
        return i;
    }

    public static void quickSort(int s[], int start, int end) {
        if (start < end) {
            int i = position(s, start, end);
            quickSort(s, start, i - 1);
            quickSort(s, i + 1, end);
        }
    }
}
