package DynamicProgramming;

public class KnapsackTopDown {

    public static void main(String args[]) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int W = 50;
        int n = val.length;

        System.out.println(knapsack(wt,val,W,n));
    }

    public static int knapsack(int wt[],int val[],int W,int n){

        int [][]dp = new int[n+1][W+1];

        for (int i=0;i<=n;i++)
            for (int j = 0; j <= W; j++)
                if (i == 0 || j == 0)
                    dp[i][j] = 0;


        for (int i=1;i<n+1;i++){
            for (int j=1;j<W+1;j++){
                if (wt[i-1] <= j)
                    dp[i][j] = Math.max( val[i-1]+dp[i-1][ j-wt[i-1] ] , dp[i-1][j] );
                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        return dp[n][W];
    }
}
