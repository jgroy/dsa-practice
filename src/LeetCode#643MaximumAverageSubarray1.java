class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //BruteFore approach...
        // double maxsum = Integer.MIN_VALUE;
        // for(int i=0;i<=nums.length-k;i++)
        // {
        //     double currentsum=0;
        //     for(int j=i;j<i+k;j++){
        //         currentsum+=nums[j];
        //     }
        //     maxsum = Math.max(currentsum,maxsum);
        // }
        // return maxsum/k;

        double slidingwindow = 0;

        for(int i =0;i<k;i++){
            slidingwindow+=nums[i];
        }
        double maxsum = slidingwindow;
        for(int i =k;i<nums.length;i++){
            slidingwindow = slidingwindow +nums[i] - nums[i-k];
            maxsum = Math.max(slidingwindow,maxsum);
        }
        return maxsum/k;
    }
}