class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[]=new int[k];

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i =0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();

        for(int i=0;i<=nums.length;i++)
        {
            arr.add(new ArrayList<>());
        }

        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            arr.get(e.getValue()).add(e.getKey());
        }

     
        for(int i=nums.length ;i>0;i--)
        {
            for(int j=0;j<arr.get(i).size() && k>0;j++)
            {
                res[k-1]=arr.get(i).get(j);
                k--; 
            }
            
        }


        return res;
    }
}