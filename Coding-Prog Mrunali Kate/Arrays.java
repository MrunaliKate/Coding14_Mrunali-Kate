import java.util.*;
class Arrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] rotatedArr = rotateLeft(arr);
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Array after rotating left by 1 position: " + Arrays.toString(rotatedArr));
    }
    public static int[] rotateLeft(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;

        return arr;
    }
}
