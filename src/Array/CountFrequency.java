package Array;

// https://www.geeksforgeeks.org/count-frequencies-elements-array-o1-extra-space-time/?ref=rp
public class CountFrequency {

    public static void main(String[] args) {

        int arr[] = { 2,3,3,2,5};
        int size = arr.length;

        countFreq(arr);
    }

    // TC - O(n) SC - O(1)
    public static void countFreq(int[] arr){

        int i = 0;
        while(i<arr.length){

            if(arr[i]<=0){
                i++;
                continue;
            }

            int index = arr[i] - 1;

            if(arr[index]>0){
                arr[i] = arr[index];
                arr[index] = -1;
            }else {
                arr[index]--;
                arr[i] = 0;
                i++;
            }
        }

        System.out.println("Below are counts of all elements");

        for (int j = 0; j < arr.length; j++)
            System.out.println(j+1 + "->" + Math.abs(arr[j]));

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                System.out.println("Frequency of "+ (j+1) + " is "+Math.abs(arr[j]));
            }
        }
    }
}
