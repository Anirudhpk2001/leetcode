import java.util.*;
import java.util.stream.Collectors;

class Solution {
    List<List<Integer>> result;

    public void swap(int idx, int i, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }

    public void solve(int idx, int[] nums) {
        if (idx == nums.length) {
            result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return;
        }
        Set<Integer> set=new HashSet<>();
        for (int i = idx; i < nums.length; i++) {
            if(set.contains(nums[i]))
            {
                continue;
            }
                set.add(nums[i]);
                swap(idx, i, nums);
                solve(idx + 1, nums);
                swap(idx, i, nums); 

            
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        result = new ArrayList<>();
        solve(0, nums);
        return result;
    }
}
