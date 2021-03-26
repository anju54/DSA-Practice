package BinarySearch;

public class SearchOnReverseSortedArray {

    public static void main(String[] args) {

        int arr[] = new int[]{5,4,3,2,1};

        int result = search(arr,1);
        System.out.println(result);
    }

    // Find key in reverse sorted unique array
    public static int search(int arr[],int key){

        int low = 0;
        int high = arr.length - 1;

        int mid = 0;

        while (low<=high){

            mid =  low + ((high-low)/2);

            if(arr[mid]==key)
                return mid;
            else if (key < arr[mid])  //1 < 3
                low = mid + 1;
            else
                high = mid - 1;

        }
        return mid;
    }
}
