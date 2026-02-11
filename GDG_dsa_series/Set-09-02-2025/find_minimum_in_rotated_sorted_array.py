class Solution(object):
    def findMin(self, nums):
        left, right = 0, len(nums) - 1
        smallest = nums[0]

        while left <= right:
            if nums[left] < nums[right]:
                smallest = min(nums[left], smallest)
                return smallest
            mid = (left + right) // 2
            smallest = min(nums[mid], smallest)
            if nums[mid] >= nums[left]:
                left = mid + 1
            else:
                right = mid - 1
        return smallest
