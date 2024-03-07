class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2)
        {
            return nums.length;
        }

       
        int j = 1; // pointer to keep track of the position where we can place the next non-duplicate element
        int count = 1; // count of occurrences of the current element
        
        // Start iterating from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is equal to the previous element, increment the count
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                // If the current element is different from the previous element, reset the count to 1
                count = 1;
            }
            
            // If the count is less than or equal to 2, copy the current element to the next available position
            if (count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }
        
        // After processing all elements, return the length of the modified array
        return j;
      
    }
}