package sdesheet;

/**
 * leetcode 48
 * You are given an n x n 2D matrix representing an image,
 * rotate the image by 90 degrees (clockwise)
 */
public class RotateImage {

    // in place solution
    // tc - o ( n2 ) for transpose + o(n2) for reverse
    public void rotate(int[][] matrix) {

        // do transpose
        int r = matrix.length; int c = matrix[0].length;
        for(int i=0; i< r;i++){
            for(int j=i; j< c;j++){  // mind j = i
                int temp =  matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // reverse very row using two pointer
        for(int i=0; i< r;i++){
            int left = 0; int right = matrix[i].length - 1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
