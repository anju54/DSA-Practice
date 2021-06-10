package Array;

import java.util.*;

public class LeetCode4Sum {

    public static void main(String[] args) {
        int arr[] = new int[]{4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        Set<List<Integer>> res = findTotalSum(arr, arr.length, 9);

        for (List<Integer> set : res) {
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }
            System.out.println();
        }
    }

    // o ( n3 logn ) + nlogn
    // logn for binary serach and nlog for sorting
    private static Set<List<Integer>> findTotalSum(int[] arr, int n, int target) {

        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[k] == arr[k-1])
                        continue;
                    int sum = arr[i] + arr[j] + arr[k];
                    int fourNumber = target - sum;
                    int bs = binarySearch(arr, k + 1, n - 1, fourNumber);
                    if (bs != -1) {
                        res.add((Arrays.asList(arr[i], arr[j], arr[k], bs)));
                    }
                }
            }
        }
        return res;
    }

    private static int binarySearch ( int[] arr, int start, int end, int key){
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key)
                return arr[mid];
            else if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
