package Arrays;

public class moveZeros {
    //Leetcode 283
    public static void Move(int nums[]){

        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] =0;
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] ={0,1,0,3,12};

        Move(nums);

        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
