class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=k;
        double maxavg=Double.MIN_VALUE;
        double curr=0;
       
        for( int q=0;q<k;q++)
            {
                curr+=nums[q];
                
            }
            maxavg=curr/k;
        while( j<nums.length)
        {   
            curr=curr+nums[j]-nums[i];
            maxavg=Math.max(curr/k,maxavg);
            i++;
            j++;
        }
        return maxavg;

    }
}