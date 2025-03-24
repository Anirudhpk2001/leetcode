class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(nums[1]);

        int k=2;
        int i=0;
        int j=0;

        while(k<nums.length)
        {
            if(nums[i]>arr.get(j))
            {
                nums[i+1]=nums[k];
                i++;
            }
            else
            {
                arr.add(nums[k]);
                j++;
            }
            k++;
        }

        for(int a:arr)
        {
            nums[i+1]=a;
            i++;
        }


        return nums;
        
    }
}