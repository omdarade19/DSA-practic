package slidingWindow;

public class minLenSubarray {
    //Leetcode 209

    //Given an array of positive integers nums and a positive integer target,
    // return the minimal length of a subarray whose sum is greater than or equal
    // to target. If there is no such subarray, return 0 instead.

    public static int minLen(int tar, int nums[]){

        int minLen = Integer.MAX_VALUE;
        int lp=0;
        int sum=0;

        for(int rp =0; rp<nums.length; rp++){
            sum +=nums[rp];

            while(sum >= tar){
                minLen = Math.min(minLen,rp-lp+1);

                sum-=nums[lp];
                lp++;
            }
        }
        if(minLen == Integer.MAX_VALUE){
            return 0;
        }else{
            return minLen;
        }
    }

    public static void main(String[] args) {
        int nums[] ={2,3,1,2,4,3};
        int tar = 7;

        System.out.print("the min len of the subArray Sum is -> "+minLen(tar, nums));
    }
}
