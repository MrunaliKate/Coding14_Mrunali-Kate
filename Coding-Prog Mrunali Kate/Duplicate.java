import java.util.*;
class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 1};
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
    }
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                list.add(num);
            }
        }
        int[] uniqueArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            uniqueArr[i] = list.get(i);
        }
        return uniqueArr;
    }
}
