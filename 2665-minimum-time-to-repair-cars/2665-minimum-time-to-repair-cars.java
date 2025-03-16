class Solution {
    public long calculateCount(long mid,int[] ranks)
    {
        long count=0;

        for(int rank:ranks)
        {
            count += (long) Math.floor(Math.sqrt(mid / rank));
            
        }
        return count;
    }

    public long repairCars(int[] ranks, int cars) {
        long low=1;
        int max=Arrays.stream(ranks).max().getAsInt();
       

        long high=(long) max*cars*cars;
        long count=0;
        while(low<=high)
        {
            long mid=low+(high-low)/2;

            count=calculateCount(mid,ranks);

            if(count>=cars)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }

        }

        return low;




    }
}