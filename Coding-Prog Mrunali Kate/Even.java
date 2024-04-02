import java.util.*;
class Even{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        countEvenOdd(arr);
        }
        public static void countEvenOdd(int[] arr) {
            int evenCount = 0;
            int oddCount = 0;
            for(int num:arr){
                if(num%2==0){
                    evenCount++;
                }else{
                    oddCount++;
                }
            }
            System.out.println("Even numbers are "+evenCount);
            System.out.println("Odd numbers are "+oddCount);
        }
}