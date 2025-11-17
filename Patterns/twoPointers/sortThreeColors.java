package Patterns.twoPointers;

public class sortThreeColors {
    //Leetcode 75

    public static void sort(int[] nums){
        int i = 0;
        int k =0;
        int j = nums.length-1;

        while(k <= j){

            if(nums[k] == 0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                i++;
                k++;
            }else if(nums[k] == 2){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
               j--;
            }else{
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};

        sort(nums);

        for(int num : nums){
            System.out.print(num +" ,");
        }
    }
}
