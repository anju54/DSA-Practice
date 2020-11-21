package Graph;

public class GraphUsingAdjacencyMatrix {

    private boolean adjMatrix[][];

    private int numVertices;

    // initialize the matrix
    public GraphUsingAdjacencyMatrix(int vertices){
        this.numVertices = vertices;
        adjMatrix = new boolean[vertices][vertices];
    }

    public void addEdge(int i,int j){
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    public void removeEdge(int i,int j){
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    public static void main(String[] args) {
        GraphUsingAdjacencyMatrix g = new GraphUsingAdjacencyMatrix(5);

        g.addEdge(0,1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
    }


}
