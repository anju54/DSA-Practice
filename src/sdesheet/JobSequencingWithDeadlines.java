package sdesheet;

import java.util.*;
// https://www.youtube.com/watch?v=zPtI8q9gvX8&ab_channel=AbdulBari
// https://leetcode.com/discuss/interview-question/1065228/Job-sequencing-Problem
public class JobSequencingWithDeadlines {

    public static void main(String[] args) {

        int deadlines[] = new int[]{3,4,4,2,3,1,2};
        int profit[] = new int[]{35,30,25,20,15,12,5};
        int jobIds[] = new int[]{1,2,3,4,5,6,7};

        int[] result = solution(jobIds,profit,deadlines,jobIds.length);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int jobs[],int profits[],int deadlines[],int n){

        int maxProfitGained = 0;
        int jobCount = 0;

        // store all the jobs
        ArrayList<Job> jobsArrayList = new ArrayList<>();
        for (int i=0;i<n;i++)
            jobsArrayList.add(new Job(jobs[i],deadlines[i],profits[i]));

        // sort by profit descending order
        Collections.sort(jobsArrayList, new Comparator<Job>() {
            @Override
            public int compare(Job j1, Job j2) {
                return j2.profit - j1.profit;
            }
        });

        int maxDeadline = deadlines[0];
        for (int i = 1; i < deadlines.length; i++) {
            maxDeadline = Math.max(maxDeadline,deadlines[i]);
        }
        // store the max deadline
        boolean[] timeSlotsList = new boolean[maxDeadline];
        System.out.println(timeSlotsList[2]);

        // traverse the array and mark the slot as true
       for (Job job : jobsArrayList){
           int index = job.deadlines - 1;
           if (!timeSlotsList[index]){
               jobCount++;
               maxProfitGained = maxProfitGained + job.profit;
               timeSlotsList[index] = true;
               //break;
           }
       }
        return new int[]{maxProfitGained,jobCount};
    }
}

class Job{

    int jobId;
    int deadlines;
    int profit;

    Job(int id,int d,int p){
        jobId = id;
        deadlines = d;
        profit = p;
    }
}
