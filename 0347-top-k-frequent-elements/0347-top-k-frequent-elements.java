class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[k];
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }   

        ArrayList<ArrayList<Integer>> Buckets =  new ArrayList<>();

        for(int i=0;i<=nums.length;i++)
        {
            Buckets.add(new ArrayList<>());
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            Buckets.get(e.getValue()).add(e.getKey());
        }
        
        

        for(int i=nums.length;i>=0;i--)
        {
            for(int j=0;j<Buckets.get(i).size() && k>0 ;j++)
            {
                result[k-1] = Buckets.get(i).get(j);
                k--;
            }
        }

        return result;
    }
}