public class MaxSubarr {
    public static void main(String[] args) {
        // https://leetcode.com/problems/maximum-subarray
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    static int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = nums[0];
        
        for(int i=1; i<nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
            result = Math.max(result, sum);
        }
        return result;
    }
}
