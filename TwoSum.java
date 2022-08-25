import java.util.HashMap;
// https://leetcode.com/problems/add-two-numbers/

public class TwoSum{ 

    public int[] twoSum(int[]nums, int target){
        HashMap<Integer, Integer> map = new HashMap();

        // fill HM
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }
        
        //searching
        for(int i=0; i<nums.length;i++){ // 2 7 11 15 target=4
            int num=nums[i]; // 2 (0)
            int rem=target-num; // 2(0)
            if(map.containsKey(rem)){
                int index=map.get(rem);
                if(index==i)continue;
                return new int[]{i,index}; //0,0
            }
        }
        return new int[]{};
    }
}