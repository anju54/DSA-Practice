package DynamicProgramming;

public class EqualSumPartition {

    public static void main(String[] args) {
        int set[] = { 1, 5, 11,5 };
        int sum = 0;
        int n = set.length;

        for (int i=0;i<n;i++)
            sum += set[i];
        if (sum%2 != 0)
            System.out.println("Not possible");
        else{
            if (isEqualSubsetSum(set, n, sum/2) == true)   // if equal division is possible then sum must be even no
                System.out.println("\n Found ");           // so now we have to find a subset with target as sum/2
            else
                System.out.println("No subset with given sum");
        }

    }

    private static boolean isEqualSubsetSum(int[] set, int n, int sum) {

        boolean dp[][] = new boolean[n+1][sum+1];

        for (int i=0;i<n+1;i++)
            for (int j=0; j<sum+1; j++)
                if (i==0)
                    dp[i][j] = false;
                else if (j==0)
                    dp[i][j] = true;

        dp[0][0] = true;

        for (int i=1;i<n+1;i++){
            for (int j=1;j<sum+1;j++){
                if(set[i-1] <= j )
                    dp[i][j] = dp[i-1][j- set[i-1]] || dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        return dp[n][sum];
    }
}
