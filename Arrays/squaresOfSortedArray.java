package Arrays;

public class squaresOfSortedArray {
    //Leetcode 977
    //Given an integer array nums sorted in non-decreasing order,
    // return an array of the squares of each number sorted in non-decreasing order.

    public static int[] sortedAquare(int nums[]){

        int i = nums.length-1,
            lp = 0,
            rp = nums.length-1;

        int ans[] = new int [nums.length];

        while(lp <= rp){

            if(Math.abs(nums[lp]) > Math.abs(nums[rp])){
                ans[i] = nums[lp]*nums[lp];
                i--;
                lp++;
            }else{
                ans[i] = nums[rp]*nums[rp];
                rp--;
                i--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] ={-7,-3,2,3,11};

        int ans[] = sortedAquare(nums);
        for(int num: ans){
            System.out.print(num+" ");
        }
    }
}
