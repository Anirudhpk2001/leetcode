class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> countMap = new HashMap<>();

        for(int num:nums)
        {
            countMap.put(num,countMap.getOrDefault(num,0)+1);
        }
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<>();
        int[] result = new int[k];
        for(int i =0;i<=nums.length;i++)
        {
            bucket.add(new ArrayList<Integer>());
        }
        for(Map.Entry<Integer,Integer> e : countMap.entrySet())
        {
            bucket.get(e.getValue()).add(e.getKey());
        }
        int l=0;
        for(int i=bucket.size()-1;i>=0;i--)
        {

            if(k>0)
            {
                for(int j=bucket.get(i).size()-1 ;j>=0;j--)
                {
                    if(k>0 )
                    {
                        result[l] = bucket.get(i).get(j);
                        k--;
                        l++;
                    }
                    else
                    {
                        break;
                    }
                    
                }
            }
            else
            {
                break;
            }
        }

        return result;
        


    }
}