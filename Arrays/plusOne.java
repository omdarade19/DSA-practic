package Arrays;

public class plusOne {
//Leetcode 66

    public static int[] plusOne(int[] digits){

        for(int i=digits.length-1; i>=0; i--){

            if(digits[i] == 9){
                digits[i]=0;
            }else{
                digits[i] = digits[i]+1;
                return digits;
            }
        }
        int ans[] = new int[digits.length+1];
        ans[0] =1;

        return ans;
    }

    public static void main(String[] args) {
        int [] digits = {9,9};

        int [] ans = plusOne(digits);

        for(int num : ans){
            System.out.print(num+" ");
        }
    }
}
