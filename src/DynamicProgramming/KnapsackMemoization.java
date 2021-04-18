package DynamicProgramming;

import java.util.Arrays;

public class KnapsackMemoization {

    static int t[][] = new int[4][51];

    public static void main(String args[]) {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;

        for (int[] r : t)
            Arrays.fill(r,-1);

//        for (int i = 0; i <= n; i++){
//            for (int j = 0; j <= w; j++)
//                System.out.println (t[i][j]);
//        }

       // solve(W, n,wt, val);
        System.out.println(solve(W, n,wt, val));
    }

    private static int solve(int w, int n, int[] wt, int[] val) {

        if(w==0 || n==0)
            return 0;

        if(t[n][w] != -1)
            return t[n][w];
        if(wt[n-1] > w)
            return t[n][w] = solve(w,n-1,wt,val);
        else if (wt[n-1] <= w)
            return t[n][w] = Math.max( (val[n-1] + solve( w-wt[n-1],n-1,wt,val ) ), solve(w,n-1,wt,val) );

        return t[n][w] = solve(w,n-1,wt,val);
    }
}
