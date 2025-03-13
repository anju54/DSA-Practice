package recursion;

import java.util.ArrayList;

public class SumOfAllSubsets {

    // Function to find all subsets of the array
    public static int solve(int[] arr, int index, ArrayList< Integer > op, int sum) {
        // Base case: if we have considered all elements of the array
        if (index == arr.length) {
            System.out.println(op);// Print the current subset
            System.out.println("sum : "+sum);
            return sum;
        }
        // Include the current element (arr[index]) in the subset
        op.add(arr[index]);
        sum = sum + arr[index];
        solve(arr, index + 1,op ,sum);

        op.remove(op.size() - 1); // because we have already added so to backtrack remove this

        // Do not include the current element (arr[index]) in the subset
        sum = sum - arr[index];
        return solve(arr, index + 1, op,sum);

    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 1};  // Input array
        ArrayList< Integer > op = new ArrayList<>();
        int sum = 0;
        solve(arr, 0, op,sum);  // Start with an empty subset
    }
}
