package com.array;

public class SubSetSumRecursive {

    public static void main(String[] args) {

        int set[] = { 3, 2, 4 };
        int sum = 10;
        int n = set.length;
        if (isSubsetSum(set, n, sum) == true)
            System.out.println("Found a subset with given sum");
        else
            System.out.println("No subset with given sum");
    }

    private static boolean isSubsetSum(int[] arr, int n, int sum) {

        if (n == 0)
            return false;
        if (sum==0)
            return true;

        if(arr[n-1] < sum)
            return isSubsetSum(arr,n-1,sum-arr[n-1]) || isSubsetSum(arr,n-1,sum);
        else
            return isSubsetSum(arr,n-1,sum);
    }
}
