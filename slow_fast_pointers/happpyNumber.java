package slow_fast_pointers;

public class happpyNumber {
    //Leetcode 202
    public static int digitSum(int n){
        int sum = 0;

        while(n !=0){
            int digit= n%10;
            n = n/10;
            sum = sum+(digit*digit);
        }

        return sum;
    }

    public static boolean isHappy(int n) {

        int slow = n,
                fast = n;

        while(fast != 1){

            slow = digitSum(slow);
            fast = digitSum(digitSum(fast));

            if(fast == 1){
                return true;
            }

            if(fast == slow){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 19;

        System.out.print("is this number is happy -> "+ isHappy(n));
    }
}
