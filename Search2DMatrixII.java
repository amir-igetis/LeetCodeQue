public class Search2DMatrixII {
    public static void main(String[] args) {
        // https://leetcode.com/problems/search-a-2d-matrix-ii/; 
        int[][] matrix ={
            {-1, 3}
        };
        int target = 3;
        System.out.println(matrixII(matrix, target));
    }

    static boolean matrixII(int[][] matrix, int target){
        // solution from java kk and https://www.programcreek.com/2014/04/leetcode-search-a-2d-matrix-ii-java/
        int row = 0;
        int col = matrix[row].length - 1;

        while (row<matrix.length && col>=0) {
            if (matrix[row][col] == target) {
                return true;
            }
            if (matrix[row][col] < target) {
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}
