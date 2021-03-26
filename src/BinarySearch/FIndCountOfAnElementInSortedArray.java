package BinarySearch;

public class FIndCountOfAnElementInSortedArray {

    public static void main(String[] args) {

        int arr[] = new int[]{2,4,4,10,10,10,10,18,20};

        int first = search(arr,10);
        int last = lastOccurrence(arr,10);
        int result = last - first +1;
        System.out.println(result);
    }

    // Find first occurrence of element in sorted(asc) non unique array
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

    // Find last occurrence of element in sorted(asc) non unique array
    public static int lastOccurrence(int arr[],int key){

        int start = 0;
        int end = arr.length -1;

        int res = 0;

        while (start<=end){
            int mid = start + ( end - start) / 2;
            if(arr[mid] == key) {
                res = mid;
                start = start + 1;
            }
            else if( key < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return res;
    }
}
