public class SplitArrLargSum {
    public static void main(String[] args) {
        // https://leetcode.com/problems/split-array-largest-sum/
        int[] nums = {7,2,5,10,8};
        int m = 2;
    }

    static int splitArray(int[] nums, int m){
        int max = -1;
        for (int i : nums) {
            max = Math.max(max, i);
        }
    }
}
