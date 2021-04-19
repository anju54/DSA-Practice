package DynamicProgramming;

public class LCSubstring {

    public static void main(String[] args) {

        String X = "AGGTAB";
        String Y = "GXTXAYB";

        int t[][] = new int[X.length()+1][Y.length()+1];

        System.out.println(lcs(X,Y,X.length(),Y.length(),t));
    }

    private static int lcs(String x, String y, int length, int length1, int[][] t) {

        if( length==0 || length1 == 0)
            return 0;

        for (int i=0;i<length+1;i++)
            for (int j=0;j<length1+1;j++)
                if(i==0 || j==0)
                    t[i][j] = 0;

        for (int i=1;i < length + 1; i++){
            for (int j=1; j < length1 + 1; j++){
                if( x.charAt(i-1) == y.charAt(j-1) )
                    t[i][j] = 1 + t[i-1][j-1];
                else
                    t[i][j] = 0;
            }
        }
        return t[length][length1];
    }
}
