package Backtracking;

// https://www.geeksforgeeks.org/rat-in-a-maze-backtracking-2/
// video - https://www.youtube.com/watch?v=4BBB0mvvbGA
public class RatInMaze {

    public static void main(String[] args) {

        int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 1 },
                         { 1, 1, 1, 1 } };

        int N = maze.length;
        int res[][] = new int[N][N];

        mazeSolution(maze,N,0,0,res);

        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++)
                System.out.print(res[i][j]+"\t");
            System.out.println();
        }
    }


    public static boolean mazeSolution(int [][]board,int size,int x,int y,int [][]ans){

        if (x == size-1 && y== size-1) {
            ans[x][y] = 1;
            return true;
        }

        if (isSafe(board,x,y,size)){
            ans[x][y] = 1;
            if( mazeSolution(board,size,x+1,y,ans) == true )  // going forward
                return true;
            if( mazeSolution(board,size,x,y+1,ans) == true )  // going down
                return true;
            // backtrack
            ans[x][y] = 0;
            return false;
        }
        return false;
    }

    public static boolean isSafe(int [][]maze,int i,int j,int size){

        if ( i < size && j < size && maze[i][j] == 1 )
            return true;
        else
            return false;
    }
}
