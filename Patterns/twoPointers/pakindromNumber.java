package Patterns.twoPointers;

public class pakindromNumber {

    public static boolean isPalindrome(int x) {
        if(x <0){
            return false;
        }

        int copy = x;
        int num =0;
        while(x !=0){
            int digit = x%10;
            x = x/10;

            num = num *10 + digit;
        }

        return num == copy;
    }

    public static void main(String[] args) {
        int x = 1111111;

        System.out.print("is this number is palindrom -> "+isPalindrome(x));
    }
}
