package Patterns.twoPointers;

public class squareOfArrays {

    public static int[] sortedSquares(int[] nums) {
        int i=0,
                j= nums.length-1;

        int res[] = new int[nums.length];

        int k= nums.length-1;

        while(i<=j){
            if(Math.abs(nums[i]) > nums[j]){
                res[k] = nums[i]*nums[i];
                i++;
            }else{
                res[k] = nums[j]*nums[j];
                j--;
            }
            k--;
        }

        return res;

    }

    public static void main(String[] args) {
        int nums[] ={-4,-1,0,3,10};

        int ans[] = sortedSquares(nums);

        for(int num:ans){
            System.out.print(num+" ");
        }
    }
}
