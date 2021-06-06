package DynamicProgramming;

public class MinDelAndInsertString {

    public static void main(String[] args) {

        String str1 = new String("heap");
        String str2 = new String("peas");

        // Function Call
        printMinDelAndInsert(str1, str2);
    }

    private static void printMinDelAndInsert(String str1, String str2) {

        int lcs = lcs(str1,str2,str1.length(),str2.length());
        System.out.println("lcs = "+lcs);
        int result = Math.abs( str1.length() - lcs ) + Math.abs( str2.length() - lcs );
        System.out.println(result);
    }

    private static int lcs(String a,String b, int m,int n){

        if(m==0 || n==0)
            return 0;

        int [][]dp = new int[m+1][n+1];

        for (int i=0;i<m+1;i++)
            for (int j=0;j<n+1;j++)
                if (i==0 || j==0)
                    dp[i][j] = 0;

        for (int i=1;i<m+1;i++){
            for (int j=1;j<n+1;j++){
                if (a.charAt(i-1) == b.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max( dp[i][j-1], dp[i-1][j] );
            }
        }
        return dp[m][n];
    }
}
