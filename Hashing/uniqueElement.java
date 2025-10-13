package Hashing;

import java.util.HashMap;

// leetcode 136 problem

public class uniqueElement {
    public static int singleNumber(int nums[]){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){

                map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }

        for(int key: map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};

        System.out.println("the single number in array is -> "+singleNumber(nums));
    }
}
