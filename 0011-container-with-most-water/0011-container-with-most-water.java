class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max_water = 0;

        while(i<j)
        {
            max_water = Math.max(max_water, Math.min(height[i],height[j])*(j-i));

            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }

        return max_water;
    }
}