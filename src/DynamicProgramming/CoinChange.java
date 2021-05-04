package DynamicProgramming;

public class CoinChange {

    public static void main(String args[]) {
        int arr[] = {1, 2, 3};
        int m = arr.length;
        int n = 4; // sum
        System.out.println(countWays(arr, m, n));
    }

    private static int countWays(int[] arr, int m, int sum) {

        int [][]dp = new int[m+1][sum+1];  // m is size of arr

        for (int i=0;i< m+1;i++)
            for (int j = 0; j < sum+1; j++)
                if (i == 0)
                    dp[i][j] = 0;
                else if (j==0)
                    dp[i][j] = 1;

        dp[0][0] = 0;
        for (int i = 0; i <= m; i++){
            for (int j = 0; j <= sum; j++)
                System.out.print (dp[i][j] + " ");
            System.out.println ();
        }

        for (int i=1;i<m+1;i++){
            for (int j = 1; j < sum+1; j++){
                if(arr[i-1] <= j)
                    dp[i][j] = dp[i][j-arr[i-1]] + dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[m][sum];
    }
}
