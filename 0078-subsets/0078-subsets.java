class Solution {
    List<List<Integer>> result;
    
    public void solve(int idx,List<Integer> temp,int[] nums)
    {
       
    
        result.add(new ArrayList<>(temp));
           
        for(int i=idx;i<nums.length;i++)
        {
            temp.add(nums[i]);
            solve(i+1,temp,nums);
            temp.remove(temp.size()-1);
        
        }
       

    }


    public List<List<Integer>> subsets(int[] nums) {
        result=new ArrayList<>();
     
        List<Integer> temp=new ArrayList<>();

        solve(0,temp,nums);

        return result;
        
    }
}