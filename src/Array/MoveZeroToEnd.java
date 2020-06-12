package Array;

public class MoveZeroToEnd {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 0, 2, 3, 0, 0, 2};
        arr = shiftZeroToEnd(arr);

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }

    // First insert the non zero element to the start using counter than at last fill the empty
    //part of the array by 0
    public static int[] shiftZeroToEnd(int arr[]){

        int len = arr.length;
        int count = 0;
        for(int i=0;i<len;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }

        while (count<len){
            arr[count++] = 0;
        }
        return arr;
    }
}
