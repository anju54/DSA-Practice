package Array;

public class ShiftArrayToKtimes {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        for(int i=0; i<k; i++){

            int firstElement = arr[0];
            for(int j=1; j<arr.length; j++){
                arr[j-1] = arr[j];
            }
            arr[arr.length-1] = firstElement;
        }

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}

/**
 * time complexity is o(n*k) i.e O(n);
 * space complexity is o(1) as we are not using any additional data structure.
 */