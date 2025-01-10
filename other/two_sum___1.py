class Solution:
    def twoSum(self, nums, target):
        values_indexes = {}
        for i, n in enumerate(nums):
            if target-n in values_indexes:
                return [i, values_indexes[target-n]]
            else:
                values_indexes[n] = i
    

sol = Solution()
print(sol.twoSum([2,7,11,15], 9))
