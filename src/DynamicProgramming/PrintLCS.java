package DynamicProgramming;

public class PrintLCS {

    public static void main(String[] args) {

        String X = "AGGTAB";
        String Y = "GXTXAYB";

        int t[][] = new int[X.length()+1][Y.length()+1];

        calculateLenOfLcs(X,Y,X.length(),Y.length(),t);

        lcs(X,Y,X.length(),Y.length(),t);
    }

    public static int calculateLenOfLcs(String x, String y, int m,int n, int t[][] ){

        if( m ==0 || n==0 )
            return 0;

        for (int i=0; i<m+1; i++)
            for (int j=0; j<n+1; j++)
                if (i==0 || j==0 )
                    t[i][j] = 0;

        for (int i=1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if ( x.charAt(i-1) == y.charAt(j-1) ){
                    t[i][j] = 1 + t[i-1][j-1];
                }else
                    t[i][j] = Math.max( t[i][j-1] , t[i-1][j] );
            }
        }
        return t[m][n];
    }

    private static void lcs(String x, String y, int m, int n, int[][] t) {

        int i = m;
        int j = n;
        String s = "";

        while (i>0 && j>0){
            if(x.charAt(i-1) == y.charAt(j-1)){
                s = s + x.charAt(i-1);
                i--;
                j--;
            }else {
                if(t[i][j-1] > t[i-1][j])
                    j--;
                else
                    i--;
            }
        }

        StringBuilder sb=new StringBuilder(s);
        sb.reverse();

        System.out.println(sb);
    }
}
