package Arrays;

//leetcode 122
public class BUYandSELL2 {
    public static int maxProfit(int prices[]){
        int max = 0;

        for(int i=1; i<prices.length; i++){

            if(prices[i] > prices[i-1]){
                max = max + prices[i]-prices[i-1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};

        System.out.println("the max profit is -> "+ maxProfit(prices));
    }
}
