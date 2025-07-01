class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double maxavg = 0;
        double currsum = 0;
        for(int i = 0 ;i<k;i++)
        {
            currsum += nums[i];
        }

        maxavg = currsum/k;

        int i = k;

        while(i<nums.length)
        {
            currsum = currsum-nums[i-k]+nums[i];
            maxavg = Math.max(maxavg,(currsum)/k);
            i++;
        }

        return maxavg;
    }
}