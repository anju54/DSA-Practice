package DynamicProgramming;

public class SubSetSum {

    public static void main(String[] args) {
        int set[] = { 3, 2, 4 };
        int sum = 10;
        int n = set.length;
        if (isSubsetSum(set, n, sum) == true)
            System.out.println("\n Found a subset with given sum");
        else
            System.out.println("No subset with given sum");
    }

    private static boolean isSubsetSum(int[] set, int n, int sum) {

        boolean t[][] = new boolean[n+1][sum+1];

        for (int i=0;i<=n;i++)
            for (int j = 0; j <= sum; j++)
                if (i == 0)
                    t[i][j] = false;
                else
                    t[i][j] = true;

        t[0][0] = true;

        for (int i=1;i<n+1;i++)
            for (int j=1;j<sum+1;j++)
                if(set[i-1] <= j)
                    t[i][j] = t[i-1][ j - set[i-1] ] || t[i-1][j];
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
