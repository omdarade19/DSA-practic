package Patterns.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {

    //Leetcode 15

    //Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
    // such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

    public static void helper(int f, int[] nums, List<List<Integer>>res){

        int i=f+1;
        int j=nums.length-1;

        while(i < j){
            int sum = nums[f]+nums[i]+nums[j];

            if(sum > 0){
                j--;
            }else if(sum < 0){
                i++;
            }else{
                res.add(Arrays.asList(nums[f],nums[i],nums[j]));
                i++;
                j--;

                while(i<j && nums[i] == nums[i-1]){
                    i++;
                }
                while(i<j && nums[j] == nums[j+1]){
                    j--;
                }
            }
        }
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for(int f=0; f<nums.length; f++){

            if(nums[f] > 0){
                break;
            }

            if(f == 0 || nums[f] != nums[f-1]){
                helper(f, nums, res);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] ={-1,0,1,2,-1,-4};

        List<List<Integer>> res = threeSum(nums);

        for(List<Integer> num : res){
            System.out.print(num+" ,");
        }
    }
}
