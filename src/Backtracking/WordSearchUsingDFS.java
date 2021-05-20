package Backtracking;

 // combination of search 1 7 search 2 of leetcode
public class WordSearchUsingDFS {

    public static void main(String[] args) {
        char[][] mat = {{'A', 'B', 'C', 'E'}, // 0,3 --- 1,2 --- 2,1 --
                        {'S', 'F', 'C', 'S'},
                        {'A', 'D', 'E', 'E'}
        };
        char[][] mat1 = {{'o', 'a', 'a','n' },
                         {'e', 't', 'a' , 'e'},
                         {'i', 'h', 'k' , 'r'},
                { 'i', 'f', 'l' , 'v'}
        };

        String word = "eaaao";

        System.out.println(exist(mat1,word));
    }

    private static boolean search(char[][] board, int i, int j, String word, int idx){
        if(idx == word.length() - 1) return true;
        board[i][j] -= 65;

        // for diagonal
        if(i < board.length-1 && j < board[0].length-1 && board[i+1][j+1] == word.charAt(idx+1)
                && search(board, i+1, j+1, word, idx+1)) return true;
        if(i < board.length-1 && j > 0 && board[i+1][j-1] == word.charAt(idx+1)
                && search(board, i+1, j-1, word, idx+1)) return true;

        // for top down left right
        if(i > 0 && board[i-1][j] == word.charAt(idx+1) && search(board, i-1, j, word, idx+1)) return true;
        if(j > 0 && board[i][j-1] == word.charAt(idx+1) && search(board, i, j-1, word, idx+1)) return true;
        if(i < board.length-1 && board[i+1][j] == word.charAt(idx+1) && search(board, i+1, j, word, idx+1)) return true;
        if(j < board[0].length-1 && board[i][j+1] == word.charAt(idx+1) && search(board, i, j+1, word, idx+1)) return true;
        board[i][j] += 65;
        return false;
    }

    public static boolean exist(char[][] board, String word) {
        int r = board.length;
        if(r == 0) return false;
        int c = board[0].length;
        for(int i = 0; i < r; ++i)
            for(int j = 0; j < c; ++j)
                if(board[i][j] == word.charAt(0) && search(board, i, j, word, 0)) return true;
        return false;
    }
}