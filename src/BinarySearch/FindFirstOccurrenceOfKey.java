package BinarySearch;

public class FindFirstOccurrenceOfKey {

    public static void main(String[] args) {

        int arr[] = new int[]{2,4,4,10,10,10,18,20};

        int result = search(arr,4);
        System.out.println(result);
    }

    // Find occurrence of element in sorted(asc) non unique array
    public static int search(int arr[],int key){

        int start = 0;
        int end = arr.length -1;

        int res = 0;

        while (start<=end){
            int mid = start + ( end - start) / 2;
            if(arr[mid] == key) {
                res = mid;
                end = mid - 1;
            }
            else if( key < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return res;
    }
}
