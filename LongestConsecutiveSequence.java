public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        int ans = consecutiveSequence(nums);
        System.out.println(ans);
    }

    static int consecutiveSequence(int[] nums){
        if (nums.length == 0) {
            return -1;
        }

        int count = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == i+1) {
                ++count;
            }
        }
        return count;
    }
}
