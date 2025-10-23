package Arrays;

public class evenCount {
    //Leetcode 1295

    public static int evenCount(int nums[]){

        int evenCount =0;
        for(int num: nums){
            if((num>= 10 && num <= 99) || (num >=1000 && num <= 9999) ||(num == 100000)){
                evenCount++;
            }
        }
        return evenCount;
    }

    public static void main(String[] args) {
        int nums[] ={12,345,2,6,7896};

        System.out.println("The even numbers in the given array is-> "+evenCount(nums));
    }
}
