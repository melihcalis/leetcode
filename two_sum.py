class Solution:
    def twoSum(self, nums, target):
        values_indexes = {}
        for i in range(len(nums)):
            if target-nums[i] in values_indexes:
                return [i, values_indexes[target-nums[i]]]
            else:
                values_indexes[nums[i]] = i

sol = Solution()
print(sol.twoSum([2,7,11,15], 9))


"""class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(len(nums)-i-1):
                if nums[i] + nums[i+j+1] == target:
                    return [i, i+j+1]
                    """