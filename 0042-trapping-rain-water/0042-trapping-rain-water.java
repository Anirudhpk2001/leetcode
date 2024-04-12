class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int max=0;
        int left=0;
        int right=n-1;
        int maxleft=height[left];
        int maxright=height[right];

        if(n==0)
        {
            return 0;
        }
       
        while(left<right)
        {
            if(maxleft<maxright)
            {
                left++;
                maxleft=Math.max(maxleft,height[left]);
                max+=maxleft-height[left];
            }
            else
            {
                right--;
                maxright=Math.max(maxright,height[right]);
                max+=maxright-height[right];
            }
        }

        return max;
    }
}