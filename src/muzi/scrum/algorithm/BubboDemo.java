package muzi.scrum.algorithm;

/**
 * Created by muzi on 2017/9/15.
 */
class BubboDemo {

    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13, 4, 98, 45};
        System.out.println("排序前：");
        printArray(arr);
        for (int j = arr.length; j > 1; j--) {
            for (int i = 0; i < j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
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
