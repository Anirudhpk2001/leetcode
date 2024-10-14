class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Double> pq = new PriorityQueue<Double>(Collections.reverseOrder());

        for(int num:nums)
        {
            pq.add((double)num);
        }
        long max_result=0;
        double max=0;
        while(k>0)
        {
            max=pq.poll();
            max_result+=max;
            pq.add((double)Math.ceil(max/3));
            k--;
        }

        return max_result;
    }
}