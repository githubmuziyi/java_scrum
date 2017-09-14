package muzi.scrum.array;

/**
 * Created by muzi on 2017/9/15.
 */
class SelectSortDemo {

    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13, 4, 98, 45};
        for (int x = 0; x < arr.length -1; x++) {
            for (int i = x + 1; i < arr.length; i++) {
                if (arr[x] > arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[x];
                    arr[x] = tmp;
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
