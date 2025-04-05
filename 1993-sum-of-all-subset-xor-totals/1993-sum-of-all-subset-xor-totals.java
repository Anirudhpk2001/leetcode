class Solution {
    List<List<Integer>> res;
    private void dp(List<Integer> temp,int[] nums,int index)
    {
        if(index>=nums.length)
        {
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[index]);
        dp(temp,nums,index+1);
        temp.remove(temp.size()-1);
        dp(temp,nums,index+1);

    }
    public int subsetXORSum(int[] nums) {
         res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        dp(temp,nums,0);
        System.out.println(res);

        int total=0;

        for(List<Integer> t:res)
        {
            int curr=0;
            for(int i=0;i<t.size();i++)
            {
                curr^=t.get(i);
            }

            total+=curr;
        }



        return total;


    }
}