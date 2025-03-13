package recursion;

import java.util.ArrayList;

public class PrintSubsetsOfArray {

    // Function to find all subsets of the array
    public static void solve(int[] arr, int index, ArrayList< Integer > op) {
        // Base case: if we have considered all elements of the array
        if (index == arr.length) {
            System.out.println(op);// Print the current subset
            return;
        }
        // Include the current element (arr[index]) in the subset
        op.add(arr[index]);
        solve(arr, index + 1,op);

        op.remove(op.size() - 1); // because we have already added so to backtrack remove this
        // Do not include the current element (arr[index]) in the subset
        solve(arr, index + 1, op);

    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 1};  // Input array
        ArrayList< Integer > op = new ArrayList<>();
        solve(arr, 0, op);  // Start with an empty subset
    }
}
