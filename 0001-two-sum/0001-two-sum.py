class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        

        for i in range(0,len(nums)):
            if target-nums[i] in map :
                return [i,map.get(target-nums[i])]
            map[nums[i]] = i
        
        return []


        