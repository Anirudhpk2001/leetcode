class Solution {
    List<List<Integer>> result;
    
    public void solve(int idx,List<Integer> temp,int[] nums)
    {
        if(idx>=nums.length)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        solve(idx+1,temp,nums);
        temp.remove(temp.size()-1);
        solve(idx+1,temp,nums);

    }


    public List<List<Integer>> subsets(int[] nums) {
        result=new ArrayList<>();
     
        List<Integer> temp=new ArrayList<>();

        solve(0,temp,nums);

        return result;
        
    }
}