package sdesheet;

import java.util.Arrays;
import java.util.Comparator;

// leetcode 1235
public class JobSequencingWithEndTimeAndMaxProfit {

    public static void main(String[] args) {

        int start[] = new int[]{1,  2, 3,  4, 6};
        int endTim[] = new int[]{3, 5, 10, 6, 9};
        int profit[] = new int[]{20,20,100,70,60};

        int ans = solution(start,endTim,profit,profit.length);
        System.out.println(ans);
    }

    public static int solution(int []start,int []end, int []profit,int n){

        Jobs[] jobs = new Jobs[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Jobs(start[i],end[i],profit[i]);
        }
        Arrays.sort(jobs, Comparator.comparingInt(a -> a.end));

        int []dp = new int[n];
        //dp[0] =

        for (int i = 1; i < n; i++) {

        }
        return dp[n-1];
    }
}

class Jobs{

    int start;
    int end;
    int profit;

    Jobs(int s,int d,int p){
        start = s;
        end = d;
        profit = p;
    }
}
