package Arrays;

import java.util.ArrayList;
import java.util.List;

public class findDisapearsNumbers {
    //Leetcode 448

    //Given an array nums of n integers where nums[i] is in the range [1, n],
    // return an array of all the integers in the range [1, n] that do not appear in nums.

    public static List<Integer> find(int nums[]){

        for(int i=0; i< nums.length; i++){
            int curr = Math.abs(nums[i]);

            int idx = curr-1;

            if(nums[idx] < 0){
                continue;
            }
            nums[idx] = -1*nums[idx];
        }
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<nums.length; i++){

            if(nums[i] >0){
                ans.add(i+1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] ={4,3,2,7,8,2,3,1};

        List<Integer> ans = find(nums);

        for(int num: ans){
            System.out.print(num+" ");
        }
    }
}
