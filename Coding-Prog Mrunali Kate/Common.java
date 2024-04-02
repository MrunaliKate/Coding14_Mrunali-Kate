import java.util.*;
class Even{
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {7,3,1,5,8,4};
        commonElements(arr1,arr2);
        }
        public static void commonElements(int[] arr1, int[] arr2) {
            Set<Integer> elements = new HashSet<>();
            for(int num1:arr1){
                for(int num2:arr2){
                    if(num1 == num2){
                        elements.add(num);
                        break;
                    }
                }
            }
            System.out.println("Common elements are ");
            for(int element: elements){
                System.out.println(element);
            }
        }
}