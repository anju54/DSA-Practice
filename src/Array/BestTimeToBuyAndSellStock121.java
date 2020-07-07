package Array;

// Ques - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestTimeToBuyAndSellStock121 {

    // TC- O (n)
    public static int maxProfit1(int[] prices) {

        int max =0;
        int min = Integer.MAX_VALUE;
        for(int start=0; start<prices.length; start++){
            if( prices[start]<min )
                min = prices[start];
            else
                max = Math.max(max, prices[start]-min);
        }
        return max;
    }

    // TC - o(n^2)
    public static int maxProfit(int[] prices) {

        if(prices == null || prices.length == 0 )return 0;

        int max =0;
        int profit = 0;
        for(int start=0; start<prices.length-1; start++){

            int highest = 0;
            int count = 0;
            for(int j=start+1; j<prices.length; j++){

                if(highest<prices[j]){
                    highest = prices[j];
                    count++;
                }
            }
            if(count!=0){
                if( prices[start] < highest ){
                    profit = highest - prices[start] ;
                }
            }

            if(max<profit)
                max = profit;
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{7,1,5,3,6,4};
        System.out.println( maxProfit(arr) );

    }
}
