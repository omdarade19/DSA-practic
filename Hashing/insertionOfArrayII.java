package Hashing;

import java.util.Arrays;
import java.util.HashMap;

//Leetcode 350

public class insertionOfArrayII {
    public static int[] intersect(int[] nums1, int[] nums2) {

        if(nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums1){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int [] ans = new int[nums1.length];
        int k=0;

        for(int num: nums2){
            int count = map.getOrDefault(num,0);

            if(count == 0){
                continue;
            }else{
                ans[k]=num;
                k++;
                map.put(num,count-1);
            }
        }

        return Arrays.copyOfRange(ans, 0, k);

    }

    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int [] nums2={9,4,9,8,4};

        int ans[] = intersect(nums1,nums2);

        for(int num : ans){
            System.out.print(num+"  ");
        }
    }
}
