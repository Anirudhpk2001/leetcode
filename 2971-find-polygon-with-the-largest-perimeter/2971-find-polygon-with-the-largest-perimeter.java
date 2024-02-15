class Solution {
    public long largestPerimeter(int[] nums) {
        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
        long sum=0;
        for(int num:nums)
        {
            sum+=num;
            pq.offer((long)num);

        }
        for(int i=nums.length-1;i>=0;i--)
        {
            long max=pq.poll();
            sum=sum-max;
            if(sum>max)
            {
                return sum+max;
            }
        }
        return -1;
    }
}