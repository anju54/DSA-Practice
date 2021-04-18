package DynamicProgramming;

public class Knapsack {

    public static int solve(int w, int n, int weight[],int value[]){

        if(w==0 || n==0)
            return 0;

        if(weight[n-1] > w)
            return solve(w, n-1, weight, value);
        else
            return Math.max( value[n-1] + solve(w - weight[n-1], n-1, weight, value),
                    solve(w,n-1,weight,value));
    }

    // Driver code
    public static void main(String args[])
    {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        System.out.println(solve(W, n,wt, val));
    }
}
