package Arrays;

public class BuyAndSell {

    public static int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int num : prices){

            if(num < min){
                min = num;
            }
            if(num-min > max){
                max = num-min;
            }
        }
        return max;

    }

    public static void main(String[] args) {

        int prices [] ={7,1,5,3,6,4};

        System.out.println("the max profit is -> "+ maxProfit(prices));
    }
}
