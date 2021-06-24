class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        newNum = nums[0]
        maxNum = nums[0]
        for i in range(1, len(nums)):
            newNum = max(nums[i] + newNum, nums[i])
            maxNum = max(newNum, maxNum)

        return maxNum