package DynamicProgramming;

import java.util.Arrays;

// https://www.geeksforgeeks.org/longest-common-subsequence-dp-using-memoization/
public class LCSubsequenceLength {

    public static void main(String[] args) {

        String X = "AGGTAB";
        String Y = "GXTXAYB";

        int t[][] = new int[X.length()+1][Y.length()+1];

        // assign -1 to all positions
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        // Find the length of String
        int m = X.length();
        int n = Y.length();
        System.out.println("Length of LCS: " + lcs(X, Y, m, n,t));
    }

    // DP memoization
    private static int lcs(String x, String y, int m, int n, int t[][]){

        if (m == 0 || n == 0)
            return 0;

        if(t[m][n] != -1)
            return t[m][n];

        if( x.charAt(m-1) == y.charAt(n-1) )
            return t[m][n] = 1 + lcs(x,y,m-1,n-1,t);
        else
            return  t[m][n] = Math.max( lcs(x,y,m,n-1,t) , lcs(x,y,m-1,n,t) );
    }

    // recursive approach
    private static int lcs1(String x, String y, int m, int n) {

        // base cond -- think for smallest valid input
        if( m==0 || n==0 )
            return 0;

        if( x.charAt(m-1) == y.charAt(n-1) )
            return 1 + lcs1(x,y,m-1,n-1);
        else
            return Math.max( lcs1(x,y,m,n-1) , lcs1(x,y,m-1,n) );
    }
}
