package DynamicProgramming;

// https://www.techiedelight.com/counting-paths-on-grid-to-reach-destination-cell/
public class WaysToReachDestinationWithCost {

    // recursive approach
    static int countPaths(int [][]matrix,int i,int j,int cost){

        if (cost < 0 )
            return 0;

        if (i==0 && j==0)
            return matrix[0][0] - cost == 0 ? 1 : 0;

        // if we are first row we can only go left
        if (i==0)
            return countPaths(matrix,i,j-1,cost-matrix[i][j]);

        // if we are at the first column, we can only go up
        if (j==0)
            return countPaths(matrix,i-1,j,cost-matrix[i][j]);

        return countPaths(matrix,i-1,j,cost - matrix[i][j]) +
                countPaths(matrix,i,j-1,cost - matrix[i][j]);
    }

    public static void main(String[] args) {
        int[][] mat =
                {
                        { 4, 7, 1, 6 },
                        { 5, 7, 3, 9 },
                        { 3, 2, 1, 2 },
                        { 7, 1, 6, 3 }
                };

        int cost = 25;

        System.out.println(countPaths(mat,mat.length-1,mat[0].length-1,cost));
    }
}
