package muzi.scrum.array;

/**
 * Created by muzi on 2017/9/15.
 * 二分查找：
 *  前提：数组必须是有序的
 */
class SearchDemo {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29};
        int index = 23;
        int i = Search(arr, index);
        System.out.println(i);
    }

    public static int Search(int[] arr, int index) {
        int max = arr.length - 1;
        int min = 0;
        int mid = (max + min)/2;
        while (arr[mid] != index) {
            if (arr[mid] > index) {
                max = mid - 1;
            } else if (arr[mid] < index) {
                min = mid + 1;
            } else {
                return mid;
            }
            mid = (max + min)/2;
            if (min > max) {
                return -1;
            }
        }
        return mid;
    }
}
