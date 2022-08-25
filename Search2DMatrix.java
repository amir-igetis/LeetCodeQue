public class Search2DMatrix {
    public static void main(String[] args) {
        // https://leetcode.com/problems/search-a-2d-matrix/
        int[][] matrix = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };

        int target = 59;
        System.out.println(search2D(matrix, target));
    }

    static boolean search2D(int[][] matrix, int target){

        int row = matrix.length;
        int col = matrix[row].length;
        int start = 0;
        int end = matrix.length - 1;

        if (matrix.length == 0) {
            return false;
        }

        while (start <= end) {
            int mid =  start+(end-start)/2;
            int elem = matrix[mid/col][mid%col];
            if (elem == target) {
                return true;
            }else if (elem < target) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
}
