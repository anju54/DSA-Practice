package Array;

// Ques - https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

public class BestTimeToBuyAndSellStock122 {

    // TC - O(n) SC- O(1) Valley peak approach
    public static int maxProfit(int[] prices) {

        int maxProfit =0;

        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{7,1,5,3,6,4}; // [1,2,3,4,5]
        System.out.println( maxProfit(arr) );

    }
}
