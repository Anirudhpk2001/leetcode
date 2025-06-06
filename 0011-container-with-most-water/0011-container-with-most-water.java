class Solution {
    public int maxArea(int[] height) {
        
        int leftTower = 0;
        int rightTower = height.length-1;
        int mxArea = 0;
        while( leftTower < rightTower)
        {
            mxArea = Math.max(mxArea,Math.min(height[leftTower] ,height[rightTower]) * (rightTower - leftTower));


            if(height[leftTower] < height[rightTower])
            {
                leftTower++;
            }
            else
            {
                rightTower--;
            }


        }

        return mxArea;
    }
}