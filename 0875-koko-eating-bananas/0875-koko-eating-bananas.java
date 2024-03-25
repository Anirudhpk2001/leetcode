class Solution {
    private double HoursReq(int[] piles,int rateOfEating){
        double hourreq=0;
        for(int pile:piles)
        {
            hourreq+=Math.ceil((double)pile/(double)rateOfEating);
            
        }
        return hourreq;
        
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Arrays.stream(piles).max().getAsInt();
        
        int low=1;
        int mid=0;
        int ans=0;
        while(low<=max)
        {
            mid=low+(max-low)/2;
            if(HoursReq(piles,mid)<=h)
            {
                ans=mid;
                max=mid-1;
            }
           
            else
            {
                low=mid+1;
            }
            
        }
        return ans;
            
    }
}