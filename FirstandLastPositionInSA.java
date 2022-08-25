import java.util.Arrays;

public class FirstandLastPositionInSA {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
        int[] nums ={5,7,7,8,8,10};
        int target = 7;
        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }

    // static int firstIndex(ArrayList list, Integer target){
    //     return list.indexOf(target);
    // }

    // static int lastIndex(ArrayList list, Integer target){
    //     return list.lastIndexOf(target);
    // }

    // public ArrayList<Integer> searchRange(int[] nums, int target){
    //     ArrayList<Integer> list= new ArrayList<>();
    //     for (int i : nums) {
    //         list.add(i);
    //     }
    //     if (list.contains(target) == false || list == null) {
    //         list.add;
    //     }
    //     return arr;
    // }
    // if (Arrays.asList(count).contains(tabela[i])==false){
    //     c++;
    // }

    static int findStartIndex(int[] nums, int target){
        // maybe from nick white, see programcreek solution also
        int indexOne = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (target<=nums[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            } if (target == nums[mid]) {
                indexOne = mid;
            }
        }
        return indexOne;
    }

    static int findEndIndex(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (target>=nums[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            } if (target == nums[mid]) {
                index = mid;
            }
        }
        return index;
    }

    static int[] searchRange(int[] nums, int target){
        int[] ans = new int[2];
        ans[0] = findStartIndex(nums, target);
        ans[1] = findEndIndex(nums, target);
        return ans;
    }

    // programcreek solution
    // public int[] searchRange(int[] nums, int target) {
    //     int l=0;
    //     int r=nums.length-1;
     
    //     while(l<r){
    //         int m=l+(r-l)/2;
    //         if(nums[m]<target){
    //             l=m+1;
    //         }else{
    //             r=m;
    //         }
    //     }
     
    //     int first=l;
    //     if(l<nums.length&&nums[l]==target){//l is in boundary and is the target
    //         l=0;
    //         r=nums.length-1;
    //         while(l<r){
    //             int m=l+(r-l+1)/2;
    //             if(nums[m]>target){
    //                 r=m-1;
    //             }else{
    //                 l=m;
    //             }
    //         }
     
    //         return new int[]{first, r};
    //     }
     
    //     return new int[]{-1,-1};
    // }
}
