class Solution {
    public int trap(int[] height) {
        int[] left_max = new int[height.length+1];
        int[] right_max = new int[height.length+1];
        right_max[height.length] = height[height.length-1];
        left_max[0] = height[0];

        int n = height.length-1;
        for(int i=0;i<height.length;i++)
        {
            left_max[i+1] = Math.max(left_max[i],height[i]);
            right_max[n-i] = Math.max(right_max[n-i+1],height[n-i]);
        }

        int result = 0;
        for(int i=0;i<height.length;i++)
        {
            result+= Math.min(left_max[i+1],right_max[i]) - height[i];
        }

        return result;
    }
}