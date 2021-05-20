package Backtracking;

// https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/
public class NqueenProblem {

    // return true if that place is safe
    public static boolean isAttack(int row, int col, int[][] board, int N) {

        int i,j;

        // check left
        for ( i = 0; i < col; i++) {
            if (board[row][i] == 1)
                return false;
        }

        // check upper diagonal on left side
        for (i=row, j=col; i >= 0 && j >= 0 ;i--,j--){
            if (board[i][j] == 1)
                return false;
        }
        // check lower diagonal on left side
        for (i=row, j=col; i < N && j >= 0 ; i++, j--  ){
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    public static boolean nQueen(int N, int[][] board,int col) {

        if (col >= N)
            return true;

        for (int i=0; i<N; i++){
            if ( isAttack(i,col,board,N)){
                board[i][col] = 1;
                if (nQueen(N, board, col + 1))
                    return true;
                //backtrack
                board[i][col] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        int[][] board = new int[4][4];

        for(int row=0;row<4;row++) {
            for(int col=0;col<4;col++)
                board[row][col] = 0;
        }

        //printing the matrix
        System.out.println("Input ------");
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++)
                System.out.print(board[i][j]+"\t");
            System.out.println();
        }

        nQueen(4, board,0);

        System.out.println("output ----");
        //printing the matrix
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++)
                System.out.print(board[i][j]+"\t");
            System.out.println();
        }
    }
}
