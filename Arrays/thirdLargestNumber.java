package Arrays;

import java.util.Arrays;

public class thirdLargestNumber {
    //Leetcode 414

    //Given an integer array nums, return the third distinct maximum number
    // in this array. If the third maximum does not exist, return the maximum number.

    public static  int thirdMax(int nums[]){

        int count =0;
        Arrays.sort(nums);
        int large = nums[nums.length-1];

        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] != large){
                count++;
                large = nums[i];
            }

            if(count ==2){
                return nums[i];
            }
        }

        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        int nums[] ={2,2,3,1};

        System.out.print("the Third Max numbeer is -> "+thirdMax(nums));
    }
}
