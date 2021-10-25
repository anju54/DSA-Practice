package Graph;

import java.util.ArrayList;

/**
 * Graph representation using Adjacency list
 */
public class GraphAdjList {

    public static void main(String[] args) {

        int V = 5;
        ArrayList< ArrayList<Integer>> adjList = new ArrayList<>(V);

        for (int i = 0; i < V; i++) {
            adjList.add( new ArrayList<>());
        }
        GraphAdjList graph = new GraphAdjList();
        graph.addEdge(0,1, adjList);
        graph.addEdge(0,4, adjList);
        graph.addEdge(4,3, adjList);
        graph.addEdge(3,2, adjList);
        graph.addEdge(1,2, adjList);

        graph.printGraph(adjList);
    }

    public void printGraph(ArrayList< ArrayList<Integer>> adjList){

        for (int i = 0; i < adjList.size(); i++) {
            System.out.print("from vertex " + i );
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print( " -> "+adjList.get(i).get(j));
            }
            System.out.println();
        }
    }

    public void addEdge(int u,int v,ArrayList< ArrayList<Integer>> adjList){

        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
}
