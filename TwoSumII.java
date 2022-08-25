import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        // https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
        int[] nums = {2,7,11,15};
        int target = 26;
        System.out.println(Arrays.toString(twoSumSol(nums, target)));
    }

    static int[] twoSumSol(int[] nums, int target){
        // https://www.programcreek.com/2014/03/two-sum-ii-input-array-is-sorted-java/
        if (nums.length == 0) {
            return null;
        }
        int start = 0;
        int end = nums.length-1;
        while (start<end) {
            int elem = nums[start] + nums[end];
            if (target<elem){
				end--;
			}else if(target>elem){
				++start;
			}else{
				return new int[] {start+1, end+1};
			}
        }
        return null;
    }
}
