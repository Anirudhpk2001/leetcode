class Solution {
    private int timeRequired(int k,int[] piles)
    {
        int total_time = 0;
        for(int pile:piles)
        {
            total_time+=Math.ceil((double)pile/(double)k);
        }
        return total_time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max_count = 0;

        for(int pile:piles)
        {
            max_count = Math.max(max_count,pile);
        }

        int left = 1;
        int right = max_count;
        int result = 0;

        while(left<=right)
        {
            int mid = (left + right)/2;

            if(timeRequired(mid,piles)<=h)
            {
                right = mid-1;
                result = mid;
            }
            else
            {
                left = mid+1;
            }

        }

        return result;
    }
}