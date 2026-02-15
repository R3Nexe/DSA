class Solution(object):
    def maxSubArray(self, nums):
        maxsum = nums[0]
        sum = 0
        for i in nums:
            sum = max(sum + i, i)
            if maxsum < sum:
                maxsum = sum
        return maxsum
