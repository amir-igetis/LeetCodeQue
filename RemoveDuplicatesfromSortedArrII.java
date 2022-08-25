public class RemoveDuplicatesfromSortedArrII {
    public static void main(String[] args) {
        // https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
        int[] nums = {1,1,1,2,2,3};
        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }

    static int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }
        int in = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[in-2]) {
                nums[in++] = nums[i];
            }
        }
        return in;
    }
}
