class Solution {
    List<List<Integer>> result;
    Set<Integer> set;
    public void solve(List<Integer> temp,int[] nums)
    {
        if(temp.size()==nums.length)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                System.out.println(nums[i]);
                temp.add(nums[i]);
                set.add(nums[i]);
                solve(temp,nums);
                temp.remove(temp.size()-1);
                set.remove(nums[i]);
            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        result= new ArrayList<>();
        set=new HashSet<>();
        List<Integer> temp=new ArrayList<>();
        solve(temp,nums);

        return result;
    }
}