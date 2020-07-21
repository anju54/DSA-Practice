package Backtracking;

public class NqueenProblem {

    public static boolean isAttack(int row, int col, int board[][], int N) {
        int k, l;
        // checking for column j
        for(k=1; k<=row-1; k++) {
            if(board[k][col] == 1)
                return true;
        }

        // checking upper right diagonal
        k = row-1;
        l = col+1;
        while (k>=1 && l<=N) {
            if (board[k][l] == 1)
                return true;
            k=k+1;
            l=l+1;
        }

        // checking upper left diagonal
        k = row-1;
        l = col-1;
        while (k>=1 && l>=1) {
            if (board[k][l] == 1)
                return true;
            k=k-1;
            l=l-1;
        }

        return false;
    }

    /**
     * @param row
     * @param n number of queen
     * @param N length of the board
     * @param board
     * @return
     */
    public static boolean nQueen(int row, int n, int N, int board[][]) {
        if (n==0)
            return true;

        for (int j=1; j<=N; j++) {
            if(!isAttack(row, j, board, N)) {
                board[row][j] = 1;

                // Check if possible to place next queen
                if (nQueen(row+1, n-1, N, board))
                    return true;

                // If we reached here that means it is not possible to place the queen so now backtrack
                board[row][j] = 0; //backtracking
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] board = new int[5][5];

        for(int row=0;row<=4;row++) {
            for(int col=0;col<=4;col++)
                board[row][col] = 0;
        }

        nQueen(1, 4, 4, board);

        //printing the matix
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=4;j++)
                System.out.print(board[i][j]+"\t");
            System.out.println("");
        }
    }
}
