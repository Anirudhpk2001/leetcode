class Solution {
    public int trap(int[] height) {
        int left_max = height[0];
        int right_max  = height[height.length-1];
        int left = 0;
        int right = height.length-1;
        int rain_water = 0;
        while(left<right)
        {
            if(left_max < right_max)
            {
                left++;
                left_max = Math.max(height[left],left_max);
                rain_water+= left_max-height[left];
                
            }
            else
            {
                right--;
                right_max = Math.max(height[right],right_max);
                rain_water += right_max - height[right];
            }
        }

        return rain_water;

    }
}