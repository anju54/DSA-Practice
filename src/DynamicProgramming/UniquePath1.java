package DynamicProgramming;

public class UniquePath1 {

    public static void main(String[] args) {
        int m = 3;int n= 3;
        System.out.println(uniquePathRecursion(m,n));
        System.out.println(topDown(m,n));
    }

    static int uniquePathRecursion(int m,int n){

        if (m==1 || n== 1) // bcz when we are at 1,1 index at that time doing m-1 will make it overflow
            return 1;

        return uniquePathRecursion(m-1,n) + uniquePathRecursion(m,n-1);
    }

    /**
     * Time complexity: O(N×M)
     *Space complexity: O(N×M)
     */
    static int topDown(int m,int n){

        int [][]dp = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (i==0 || j==0)
                    dp[i][j] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }
}
