public class MinSizeSubarraySum {
    public static void main(String[] args) {
        // https://leetcode.com/problems/minimum-size-subarray-sum/
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSizeSubArrSum(nums, target));
    }

    static int minSizeSubArrSum(int[] nums, int target){
        // done from nick white video

        int ans = Integer.MAX_VALUE; // why is it not working when given Integer.MIN_VALUE, or -1;
        int start = 0;
        int countSum = 0;

        for (int i = 0; i < nums.length; i++) {
            countSum += nums[i];

            while (countSum >= target) {
                ans = Math.min(ans, i+1 - start);
                countSum -= nums[start];
                start++;
            }
        }
        // if (ans != Integer.MAX_VALUE) {
        //     return ans;
        // } else {
        //     return 0;
        // }

        // optimized version
        return (ans != Integer.MAX_VALUE) ? ans : 0;
    }
}
