package Arrays;

public class pivoteIndex {

    public static int pivotIndex(int[] nums) {

        int sum =0;
        for(int i=0; i< nums.length; i++){
            sum+=nums[i];
        }
        int ls =0;

        for(int i=0; i< nums.length; i++){
            if(sum - nums[i] == ls){
                return i;
            }
            ls +=nums[i];
            sum-=nums[i];
        }

        return -1;

    }

    public static void main(String[] args) {
        int []nums = {1,7,3,6,5,6};

        System.out.print("the pivote Index is -> "+pivotIndex(nums));
    }
}
