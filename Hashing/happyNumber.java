package Hashing;

import java.util.HashSet;

//leetcode 202
public class happyNumber {
//    A happy number is a number defined by the following process:
//
//    Starting with any positive integer, replace the number by the sum of the squares of its digits.
//    Repeat the process until the number equals 1 (where it will stay),
//    or it loops endlessly in a cycle which does not include 1.

    public static int digitSum(int n){

        int sum = 0;

        while(n!=0){
            int digit = n%10;
            n= n/10;
            sum +=(digit*digit);
        }
        return sum;
    }

    public static boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while(n !=1){
            if(set.contains(n)){
                return false;
            }

            set.add(n);

            n=digitSum(n);
        }

        return true;
    }

    public static void main(String[] args) {
        int n=19;

        System.out.println("the give number is HappyNumber -> "+ isHappy(n));
    }
}
