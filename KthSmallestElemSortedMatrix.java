public class KthSmallestElemSortedMatrix {
    public static void main(String[] args) {
        // https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
        int[][] matrix = {
            {1,5,9},
            {10,11,13},
            {12,13,15}
        };
        int k = 13;
        System.out.println(kthSmallest(matrix, k));
    }

    static int kthSmallest(int[][] matrix, int k){
        // https://www.programcreek.com/2016/08/leetcode-kth-smallest-element-in-a-sorted-matrix-java/
        // solution from programcreek
        int m = matrix.length;
        int start = matrix[0][0];
        int end = matrix[m-1][m-1];

        while (start<end) {
            int mid = start+(end-start)/2;
            int count = count(matrix, mid);
            if (count<k) {
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return end;
    }

    static int count(int[][] matrix, int target){
        int i = matrix.length-1;
        int j = 0;
        int count = 0;

        while (i>=0 && j<matrix.length) {
            if (matrix[i][j] <= target) {
                count += i+1;
                j++;
            }else{
                i--;
            }
        }
        return count;
    }
}
