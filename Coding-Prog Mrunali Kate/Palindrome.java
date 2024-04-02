import java.util.*;
class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whether it is palindrome or not:");
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.print(num+"is palindrome.");
        }
        else{
            System.out.print(num+"is not palindrome.");
        }
        
    }
        public static boolean isPalindrome(int num){
            int originalNumber = num;
            int rev=0;
            while(num!=0){
                int remainder = num%10;
                rev = rev*10+remainder;
                num /= 10;
            }
            return originalNumber == rev;
        }
}