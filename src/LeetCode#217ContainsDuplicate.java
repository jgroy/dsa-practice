import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> obj = new HashMap();
        for(int i =0;i<nums.length;i++){
            if(obj.containsKey(nums[i])) return true;
            obj.put(nums[i],0);
        }
        return false;
    }
}