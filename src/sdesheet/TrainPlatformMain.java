package sdesheet;

import java.util.Arrays;

// https://java2blog.com/minimum-number-of-platforms-required-for-railway-station/
public class TrainPlatformMain {

    // arr[] = {1:00, 1:40, 1:50, 2:00, 2:15, 4:00}
    // dep[] = {1:10, 3:00, 2:20, 2:30, 3:15, 6:00}

    public static void main(String[] args) {

        int arr[] = {0,5,15};//{100, 140, 150, 200, 215, 400};
        int dep[] = {30,20,10};//{110, 300, 210, 230, 315, 600};

        System.out.println(solve(arr,dep));
    }

    public static int solve( int arrival[] , int departure[] ){

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int n = arrival.length;
        int max = 0;
        int platformNeeded = 0;
        int i = 0; int j = 0;

        while (i<n && j<n){

            if(arrival[i]<departure[j]){
                platformNeeded++;
                i++;
                if(platformNeeded>max)
                    max = platformNeeded;
            }else {
                platformNeeded--;
                j++;
            }
        }
        return max;
    }
}
