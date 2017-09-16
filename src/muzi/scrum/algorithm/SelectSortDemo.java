package muzi.scrum.algorithm;

/**
 * Created by muzi on 2017/9/15.
 */
class SelectSortDemo {

    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13, 4, 98, 45};
        for (int x = 0; x < arr.length -1; x++) {
            int key = x;
            for (int i = x + 1; i < arr.length; i++) {
                if (arr[key] > arr[i]) {
                    key = i;
                }
            }
            if (x != key) {
                int tmp = arr[x];
                arr[x] = arr[key];
                arr[key] = tmp;
            }
            printArray(arr);
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length -1) {
                System.out.print(arr[x] + "]");
            } else {
                System.out.print(arr[x] + ",");
            }
        }
    }
}
