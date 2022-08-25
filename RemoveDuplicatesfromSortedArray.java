public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        // int[] nums = {0,1,2,3,4};
        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums){   
        int length = nums.length; 
        if(length == 0)
        {
            return 0;
        }
        int i;
        int targetIndex = 1;
        int OG = nums[0];
        for(i = 1; i < length; i++){
            
            if(nums[i] != OG){
                
                OG = nums[i];
                nums[targetIndex] = nums[i];
                targetIndex++;
            }
        }
        return targetIndex;
    }

    static int removeDuplicates2(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int originalElement = nums[0];
        int targetIndex = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != originalElement){
                originalElement = nums[i];
                nums[targetIndex] = nums[i];
                // targetIndex = targetIndex+1;
                targetIndex++;
            }
        }
        return targetIndex;
    }
}
