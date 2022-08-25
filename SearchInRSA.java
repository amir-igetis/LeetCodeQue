public class SearchInRSA {
    public static void main(String[] args) {
        // https://leetcode.com/problems/search-in-rotated-sorted-array/
        int[] nums = {4,5,6,7,0,1,2};
        int target = 1;
        int ans = searchIn(nums, target);
        System.out.println(ans);
    }

    static int searchIn(int[] nums, int target){
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return bs(nums, target, 0, nums.length-1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target>=nums[0]) {
            return bs(nums, target, 0, pivot-1);
        }

        return bs(nums, target, pivot+1, nums.length-1);
    }

    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (mid<end && nums[mid]>nums[mid+1]) {
                return mid;
            }
            if (mid>start && nums[mid]<nums[mid-1]) {
                return mid-1;
            }
            if (nums[mid]<=nums[start]) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    static int bs(int[] nums, int target, int start, int end){
        while(start<= end){
			//find the middle element
			//int mid= (start+ end)/2; //might be possible that (start + end) exceeds the range of in java
			int mid= start+(end - start)/2;

			if (target< nums[mid]){
				end = mid-1;
			}else if(target>nums[mid]){
				start=mid+1;
			}else{
				//ans found
				return mid;
			}
		}
		return -1;
    }
}
