package Arrays;

public class RotateArray {
    //Leetcode 189

    //Given an integer array nums, rotate the array to the right by k steps,
    // where k is non-negative.
    public static void reverse(int[] nums, int st, int end){
        while(st <= end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp ;
            st++;
            end--;
        }
    }
    public static void rotate(int[] nums, int k) {

        k = k%nums.length;

        reverse(nums, 0, nums.length-1);

        reverse(nums, 0, k-1);

        reverse(nums, k, nums.length-1);

    }

    public static void main(String[] args) {
        int nums[] ={1,2,3,4,5,6,7};
        int k=3;

        rotate(nums,k);

        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
