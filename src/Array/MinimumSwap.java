package Array;

// ques link :- https://www.hackerrank.com/challenges/minimum-swaps-2/problem

public class MinimumSwap {

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,1,5};
        System.out.println( minimumSwaps(arr) );
    }

    static int minimumSwaps(int[] arr) {

        int len = arr.length;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            while(arr[i] != i+1) {
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
                count ++;
            }
        }
        return count;
    }
}
