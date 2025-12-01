package slidingWindow;

public class maxAvgSubArray {

    public static double maxAvg(int nums[], int k){

        int sum =0;

        for(int i=0; i<k; i++){
            sum +=nums[i];
        }

        double max = sum *1.0/k;

        for(int i=k; i<nums.length; i++){
            sum += nums[i];
            sum -= nums[i-k];

            max = Math.max(max, sum*1.0/k);
        }


        return max;
    }

    public static void main(String[] args) {
        int nums[] ={1,12,-5,-6,50,3};
        int k = 4;

        System.out.print("the max subArray sum avg is -> "+maxAvg(nums,k));


    }
}
