package Arrays;

public class maxConjcativeOnes {
    //Leetcode 485

    public static int maxOnes(int nums[]){

        int count =0, max =0;

        for(int i=0; i< nums.length; i++){

            if(nums[i] ==1){
                count++;
            }else{
                max = Math.max(max,count);
                count =0;
            }
        }

        return Math.max(max,count);
    }

    public static void main(String[] args) {
        int nums[]={1,0,1,1,0,1};

        System.out.println("The max Conscative ones are -> "+maxOnes(nums));
    }
}
