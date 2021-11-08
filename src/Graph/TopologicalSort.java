package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class TopologicalSort {

    public static void main(String[] args) {
        int V, E;
        V = 6;
        E = 6;

        // adjacency list for storing graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<Integer>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(1);
        adj.get(4).add(0);
        adj.get(5).add(0);
        adj.get(5).add(2);

        int arr[] = topoSort(V,adj);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] topoSort(int V,ArrayList<ArrayList<Integer>> adj){
        Stack<Integer> stack = new Stack<>();

        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]){
                dfsRecursion(i,visited,adj,stack);
            }
        }

        int []result = new int[V];
        int index = 0;
        while (!stack.isEmpty()){
            result[index++] = stack.pop();
        }
        return result;
    }

    // process each node , and once it got has no adjacent node then add into stack
    public static void dfsRecursion(int i,boolean []visited,ArrayList<ArrayList<Integer>> adj,Stack<Integer> stack){

        visited[i] = true;
        for (Integer it : adj.get(i)){
            if (!visited[it]){
                dfsRecursion(it,visited,adj,stack);
            }
        }
        stack.add(i);
    }
}
