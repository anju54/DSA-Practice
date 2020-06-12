package Array;

public class DuplicateZeroes {

    public static void main(String[] args) {

        DuplicateZeroes dp = new DuplicateZeroes();
        int[] arr = new int[]{1, 2, 0, 4, 5, 6, 7};
        dp.duplicateZeros(arr);

    }

    public void duplicateZeros(int[] arr) {

        int len = arr.length;

        for(int i=0; i<len-1; i++){

            if(arr[i] == 0 || i==len-1){
                System.out.println(arr[i]);
                int len1 = len - 1;
                while(len1>i){
                    arr[len1] = arr[len1-1];
                    len1--;
                }
                arr[i+1] = 0;
                // to increment the i to next of 0 bcz we have inserted one more zero
                i++;
            }
        }


        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

    }

}
