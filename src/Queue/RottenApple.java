package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

// https://www.geeksforgeeks.org/minimum-time-required-so-that-all-oranges-become-rotten/
public class RottenApple {

    static class Pair{
        int x;
        int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        int arr[][] = { {2, 1, 0, 2, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}};
        int ans = rotOranges(arr);
        System.out.println(ans);
    }

    // Function to check whether there is still a fresh
    // orange remaining
    static boolean checkAll(int arr[][])
    {
        for (int i=0; i<arr.length; i++)
            for (int j=0; j<arr[0].length; j++)
                if (arr[i][j] == 1)
                    return true;
        return false;
    }

    private static boolean isDeli(Pair pair){

        if (pair.x == -1 && pair.y == -1)
            return true;
        else
            return false;
    }

    // just to make sure thr index is not invalid ( like -1 )
    static boolean isValid(int i,int j,int row,int col){
        return ( i >=0 && j>=0 && i<row && j<col);
    }

    private static int rotOranges(int[][] arr) {

        int row = arr.length; int col = arr[0].length;
        Queue<Pair> queue = new ArrayDeque<>();
        int ans = 0;

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (arr[i][j]==2)
                    queue.add(new Pair(i,j));
            }
        }
        queue.add(new Pair(-1,-1));

        while (!queue.isEmpty()){
            boolean flag = false;
            while (!isDeli(queue.peek())){
                Pair temp = queue.peek();

                // check bottom cell
                if (isValid(temp.x+1,temp.y ,row,col) && arr[temp.x+1][temp.y]==1 ) {
                    arr[temp.x + 1][temp.y] = 2;

                    queue.add(new Pair(temp.x+1, temp.y));

                    if (!flag){
                        ans++;
                        flag = true;
                    }
                }
                // check the left cell
                if (isValid(temp.x-1,temp.y ,row,col) && arr[temp.x-1][temp.y]==1 ) {
                    arr[temp.x - 1][temp.y] = 2;

                    queue.add(new Pair(temp.x-1, temp.y));

                    if (!flag){
                        ans++;
                        flag = true;
                    }
                }
                // check right
                if (isValid(temp.x,temp.y+1,row,col) && arr[temp.x][temp.y+1]==1){
                    arr[temp.x][temp.y+1] = 2;
                    if (!flag){
                        ans++;
                        flag = true;
                    }

                    queue.add(new Pair(temp.x, temp.y+1));
                }
                if (isValid(temp.x,temp.y-1,row,col) && arr[temp.x][temp.y-1]==1){
                    arr[temp.x][temp.y-1] = 2;
                    if (!flag){
                        ans++;
                        flag = true;
                    }

                    queue.add(new Pair(temp.x, temp.y-1));
                }
                queue.remove();
            }
            queue.remove(); // remove delimiter
            if (!queue.isEmpty()){
                queue.add(new Pair(-1,-1));
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        if (checkAll(arr))
            ans = -1;

        return ans;
    }
}
