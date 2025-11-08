package String;

public class reverseInt {
    //Leetcode 7

    //Given a signed 32-bit integer x, return x with its digits reversed.
    // If reversing x causes the value to go outside the signed 32-bit integer range
    // [-231, 231 - 1], then return 0.
    //
    //Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
    public static int reverse(int x) {

        int rev =0;

        while(x != 0){
            int dig = x%10;

            if(rev >Integer.MAX_VALUE/10){
                return 0;
            }else if(rev < Integer.MIN_VALUE/10  ){
                return 0;
            }else if(rev == Integer.MAX_VALUE/10 && dig >7){
                return 0;
            }else if(rev == Integer.MIN_VALUE/10 && dig < -8){
                return 0;
            }

            rev = rev*10 + dig;

            x = x/10;


        }



        return rev;
    }

    public static void main(String[] args) {
        int x = 999;

        System.out.println("the number is -> "+x);
        System.out.println("the rev number is -> "+reverse(x));
    }
}
