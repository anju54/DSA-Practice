package Array;

public class FindSmallestAndSecondSmallest {
    public static void main(String[] args) {
        int arr[] = {2, 13, 1, 10, 8, 1};
        print2Smallest(arr);
    }

    public static void print2Smallest(int[] arr){

        int min1 = arr[0];
        int min = arr[0];

        for (int i=1;i<arr.length;i++){
            if(min>arr[i])
                min = arr[i];
        }
        System.out.println("Min = "+min);

        for (int i=1;i<arr.length;i++){
            if(arr[i]<min1 && arr[i]>min)
                min1 = arr[i];
        }
        System.out.println("second min = "+min1);
    }
}
