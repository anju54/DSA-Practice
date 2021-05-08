package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class MinSubSetSumDiff {

    public static void main(String[] args) {
        int set[] = {3, 1, 4, 2, 2, 1};
        int sum = 0;
        int n = set.length;

        for (int i=0;i<n;i++)
            sum += set[i];

        System.out.println( isSubsetSum(set, n, sum) );
    }

    private static int isSubsetSum(int[] set, int n, int sum) {

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

        // print the dp table
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        // put the half of the last row in array
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<=sum/2;i++)
            if (t[n][i] == true )
                list.add(i);

        System.out.println(list + "sum ="+sum);

        int min = Integer.MAX_VALUE;
        for (int i=0;i<list.size();i++)
            min = Math.min(min,sum-2* list.get(i));

        return min;
    }
}
