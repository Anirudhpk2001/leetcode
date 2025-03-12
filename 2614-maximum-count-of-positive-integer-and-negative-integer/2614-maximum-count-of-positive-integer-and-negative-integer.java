class Solution {
    public int maximumCount(int[] nums) {
        
        int left=0;
        int right=nums.length-1;
        int n=nums.length;

        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(nums[mid]>=0)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }

        int negCount=left;
        left = 0;
        right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        int posCount = n - left;
        return Math.max(negCount, posCount);
    }
}