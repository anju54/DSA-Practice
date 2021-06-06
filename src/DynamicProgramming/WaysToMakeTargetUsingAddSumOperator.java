package DynamicProgramming;

import java.util.Arrays;

// https://www.geeksforgeeks.org/number-of-ways-to-calculate-a-target-number-using-only-array-elements/
public class WaysToMakeTargetUsingAddSumOperator {

    static int[][] dp = new int[5][7]; // [n+1][target+1]

    public static void main(String[] args) {

        int arr[] = new int[] { -3, 1, 3, 5 };
        int target = 6;
        int n = arr.length;

        System.out.println( "ways "+ countWays(arr,0,target) );
        System.out.println( "ways from second method "+ countWays1(arr,n,target,"") );

//        for (int[] r : dp)
//            Arrays.fill(r,-1);
//
//        System.out.println( topDown(arr,n,target) );
    }

    static int countWays(int []arr,int i,int target){

        // If target is reached, return 1
        if (target==0 && i == arr.length) {
            System.out.println(" " + i);
            return 1;
        }
        // If all elements are processed and
        // target is not reached, return
        if (i>=arr.length)
            return 0;

        return countWays(arr, i+1, target) + countWays(arr, i+1, target - arr[i] ) +
                countWays(arr, i+1, target + arr[i]) ;
    }

    static int countWays1(int []arr,int n,int target, String ans){

        if (target==0 && n == 0) { // && n == arr.length && n == 0
            System.out.println(ans);
            System.out.println(n);
            return 1;
        }
        if ( n <= 0 )
            return 0;

        //System.out.println(n);
        return countWays1(arr, n-1, target , ans ) +
                countWays1(arr, n-1, target - arr[n-1] , ans + "- "+arr[n-1] ) +
                countWays1(arr, n-1, target + arr[n-1] , ans + "+ "+arr[n-1]) ;
    }

    // memoization code
//    static int countWaysMemoization(int arr[],int n,int target){
//
//        if (target == 0 && n == 0)
//            return 1;
//        if(dp[n-1][target] != -1)
//            return dp[n-1][target];
//
//       return dp[n][target] = countWaysMemoization(arr,n-1,target) +
//               countWaysMemoization(arr,n-1,target - arr[n-1]) +
//                                countWaysMemoization(arr,n-1,target + arr[n-1]) ;
//    }
//
//    static int topDown(int arr[],int n,int target){
//
//        int [][]dp = new int[n+1][target+1];
//
//        for (int i=0;i<=n;i++)
//            for (int j = 0; j <= target; j++)
//                if (i == 0 || j == 0)
//                    dp[i][j] = 0;
//
//        for (int i = 1; i < n+1; i++) {
//            for (int j = 1; j < target+1; j++) {
//                dp[i][j] = dp[i-1][ j ] + dp[i-1][ j + arr[i-1] ] + dp[i-1][ j - arr[i-1] ] ;
//            }
//        }
//        return dp[n][target];
//    }

}
