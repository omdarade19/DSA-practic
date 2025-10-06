package Hashing;

import java.util.HashMap;

public class subArraySum {

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;
        int Sum = 0;

       for(int i=0; i<nums.length; i++){

           Sum +=nums[i];

           if(map.containsKey(Sum-k)){
               count += map.get(Sum -k);
           }

           if(map.containsKey(Sum)){
               map.put(Sum, map.get(Sum)+1);
           }else{
               map.put(Sum, 1);
           }
       }

        return count;
    }

    public static void main(String[] args){
        int[] nums = {10,-2,2,-20,10};
        int k = -10;
        System.out.println("Number of subarrays with sum " + k + " = " + subarraySum(nums, k));
    }
}
