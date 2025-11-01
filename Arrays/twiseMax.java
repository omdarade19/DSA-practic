package Arrays;

public class twiseMax {
    // leetcode 747

    public static int Index(int nums[]){

        int max =-1,
            idx = -1,
            max2 = -1;

        for(int i=0; i<nums.length; i++){
            if (nums[i] > max) {
                max2 = max;
                max = nums[i];
                idx = i;
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }


        }
        if(max / max2 >=2 || max2 <=0){
            return idx;
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] ={3,6,1,0};

        System.out.print("the index of twise max number is -> "+Index(nums));
    }
}
