class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int currentsum = 0;
        //int count=0, j =0;
        for(int i =0;i<nums.length;i++){
            currentsum = currentsum+nums[i];
            if(currentsum>maxsum){
                maxsum = currentsum;
                //j=i;
            }
            if(currentsum<0){
                currentsum=0;
                //count = i+1;
            }
        }
        //return count,j (for start and end values of subarray)
        return maxsum;
    }
}