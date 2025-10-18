package Arrays;

public class removeDuplicate {
//leetcode 26
    public static int remove(int nums[]){

        int k = 1;
        for(int i=1; i< nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int nums[] ={0,0,1,1,1,2,2,3,3,4};

        System.out.println("the k value is -> "+remove(nums));

        for(int num : nums){
            System.out.print(num+"  ");
        }
    }
}
