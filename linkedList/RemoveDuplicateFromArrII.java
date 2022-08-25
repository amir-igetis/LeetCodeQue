package linkedList;

public class RemoveDuplicateFromArrII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicate(nums));
        // https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
        // not posted on linked in
    }
    static int removeDuplicate(int[] nums){
        // https://www.youtube.com/watch?v=OZaADxYTfD4
        // from algorithms made easy channel
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
