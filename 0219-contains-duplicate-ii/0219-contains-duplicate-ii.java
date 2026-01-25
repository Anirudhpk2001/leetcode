class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        boolean containsDuplicate = false;
        
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            
            if (map.containsKey(num) && Math.abs(i - map.get(num)) <= k) {
                containsDuplicate = true;
                break;
            }
            
            map.put(num, i);
        }
        
        return containsDuplicate;
    }
}