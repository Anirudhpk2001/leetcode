class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        totalSum = 0
        maxSum = -10001

        for num in nums:
            totalSum += num

            maxSum = max(maxSum,totalSum)

            if totalSum<0:
                totalSum = 0
        

        return maxSum
        