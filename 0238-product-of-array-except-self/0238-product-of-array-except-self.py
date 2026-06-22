class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = []
        prev = 1
        for i in range(0,len(nums)):
            output.append(prev)
            prev = prev*nums[i]
        
        prev = nums[len(nums)-1]
        for i in range(len(nums)-2,-1,-1):
            output[i] *=prev
            prev = prev*nums[i]
        

        return output
        