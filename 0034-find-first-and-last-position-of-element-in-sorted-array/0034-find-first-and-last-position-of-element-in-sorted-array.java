class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        if(nums.length == 0)
        {
            return new int[]{-1,-1};
        }
        if(nums.length == 1)
        {
            if(nums[0] == target)
            {
                return new int[]{0,0};
            }
            else
            {
                return new int[]{-1,-1};
            }
        }

        int[] result = new int[2];
        while(left<=right)
        {
            int mid = left + (right-left)/2;

            if(nums[mid] >= target)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }

        if(left == nums.length || nums[left]!=target)
        {
            return new int[]{-1,-1};
        }
        else
        {
            result[0] = left;
        }
        

        left = 0;
        right = nums.length-1;
        while(left<=right)
        {
            int mid = left + (right-left)/2;

            if(nums[mid] <= target)
            {
                left = mid+1;
            }
            else
            {
                right=mid-1;
            }
        }

        if(nums[right]!=target)
        {
            result[1] = -1;
        }
        else
        {
            result[1] = right;
        }
        
        return result;
    }
}