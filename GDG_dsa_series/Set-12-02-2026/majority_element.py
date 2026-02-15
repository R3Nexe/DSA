class Solution(object):
    def majorityElement(self, nums):
        major = 0
        count = 0
        for i in nums:
            if i != major:
                if count == 0:
                    major = i
                    count += 1
                else:
                    count -= 1
            else:
                count += 1
        return major
