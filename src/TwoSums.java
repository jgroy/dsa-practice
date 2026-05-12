class Solution {
    //#1-TwoSums - LeetCode 
    //Solved on Day 2 Two Sums using brute force-Two for loops and returning an array
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(i!=j && nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}