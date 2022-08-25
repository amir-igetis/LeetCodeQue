public class FindMinInRSEII {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
        int[] nums = {2,2,2,0,1};
        int ans = findMin(nums);
        System.out.println(ans);
    }

    static int findMin(int[] nums) {
        // https://www.programcreek.com/2014/03/leetcode-find-minimum-in-rotated-sorted-array-ii-java/
        int start = 0;
        int end = nums.length - 1;

        while (start<=end) {
            while (nums[start] == nums[end] && start != end) {
                start++;
            }
            if (nums[start] <= nums[end]) {
                return nums[start];
            }
            int mid = start+(end-start)/2;
            if (nums[mid] >= nums[start]) {
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return -1;
    }
}
