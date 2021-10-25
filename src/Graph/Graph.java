import java.util.*;

/**
 * Graph traversal : BFS & DFS
 */
public class Graph {

    private int V;
    private ArrayList<ArrayList<Integer>> adj;

    Graph(int v){
        V = v;
        adj = new ArrayList<>();
        for (int i=0; i<v; ++i)
            adj.add( new ArrayList<>());
    }

    public void dfs(int start){

        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]){
                dfsRecursion(start,visited);
            }
        }
    }

    public void dfsRecursion(int start,boolean vis[]){

        System.out.print(start+" ");
        vis[start] = true;
        for (Integer i : adj.get(start)){
            if (vis[i] == false){
                dfsRecursion(i,vis);
            }
        }
    }

    public void bfs(int start){
        Queue<Integer> queue = new ArrayDeque<>();
        boolean visited[] = new boolean[V];

        visited[start] = true;
        queue.add(start);

        while ( !queue.isEmpty() ){
            int removedNode = queue.poll();
            System.out.print(removedNode+" ");
            // get all adjacent vertices of removed node
            Iterator<Integer> i = adj.get(removedNode).listIterator();
            while (i.hasNext()){
                int n = i.next();
                if (!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    void addEdge(int v,int u) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

     void printGraph() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex" + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> "+adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addEdge( 0, 4);
        graph.addEdge( 1, 2);
        graph.addEdge( 1, 3);
        graph.addEdge( 1, 4);
        graph.addEdge( 2, 3);
        graph.addEdge( 3, 4);
        graph.addEdge( 0, 1);

        graph.printGraph();
        System.out.println("---------BFS-------------------");
        graph.bfs(2);

        System.out.println("\n"+"---------DFS-------------------");
        graph.dfs(2);
    }
}
