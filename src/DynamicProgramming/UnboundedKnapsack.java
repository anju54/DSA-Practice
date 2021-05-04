package DynamicProgramming;

// https://www.geeksforgeeks.org/unbounded-knapsack-repetition-items-allowed/
public class UnboundedKnapsack {

    public static void main(String args[]) {
        int W = 100;
        int val[] = {10, 30, 20};
        int wt[] = {5, 10, 15};
        int n = val.length;

        System.out.println(knapsack(wt,val,W,n));
    }

    public static int knapsack(int wt[],int val[],int W,int n){

        int [][]t = new int[n+1][W+1];

        for (int i=0;i<n+1;i++)
            for (int j=0;j<W+1;j++)
                if (i==0 || j==0)
                    t[i][j] = 0;

        for (int i=1;i<n+1;i++){
            for (int j=1;j<W+1;j++){
                if (wt[i-1] <= j)
                    t[i][j] = Math.max( val[i-1]+ t[i][ j-wt[i-1] ] , t[i-1][j]);
                else
                    t[i][j] = t[i-1][j];
            }
        }
        return t[n][W];
    }
}
