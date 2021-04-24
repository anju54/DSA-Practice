package sdesheet;

public class SetMatrixZeroBruteForce {

    public static void main(String[] args) {

        int board[][] =new int[3][3];
        for (int row = 0; row < board.length; row++)
            for (int col = 0; col < board[row].length; col++)
                board[row][col] = 1;

        board[1][1] = 0;

        setZeroes(board);
    }

    public static void setZeroes(int[][] board) {

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }

        int gCol = board[0].length;

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if(board[row][col] == 0){

                    for(int i=0;i<board.length;i++) {
                        if (board[row][i] != 0)
                            board[row][i++] = -1;
                    }
                    for (int j=0;j<gCol;j++) {
                        if (board[j][col] != 0)
                            board[j++][col] = -1;
                    }
                }
            }
        }
        for (int row = 0; row < board.length; row++)
            for (int col = 0; col < board[row].length; col++)
                if (board[row][col] == -1)
                    board[row][col] = 0;

        System.out.println("------------  After --------------");

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}
