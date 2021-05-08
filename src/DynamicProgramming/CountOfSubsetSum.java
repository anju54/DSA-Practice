package DynamicProgramming;

public class CountOfSubsetSum {

    public static void main(String[] args) {
        int set[] = { 3, 2, 5,6,8,10 };
        int sum = 10;
        int n = set.length;

        System.out.println(isSubsetSum(set,n,sum));
    }

    private static int isSubsetSum(int[] set, int n, int sum) {

        int t[][] = new int[n+1][sum+1];

        // initialization same as subset bcz first we are checking if the subset is possible or not
        for (int i=0;i<=n;i++)
            for (int j = 0; j <= sum; j++)
                if (i == 0)
                    t[i][j] = 0;
                else
                    t[i][j] = 1;

        t[0][0] = 1;


        for (int i=1;i<n+1;i++)
            for (int j=1;j<sum+1;j++)
                if(set[i-1] <= j)
                    t[i][j] = t[i-1][ j - set[i-1] ] + t[i-1][j];
                else
                    t[i][j] = t[i-1][j];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        return t[n][sum];
    }
}
