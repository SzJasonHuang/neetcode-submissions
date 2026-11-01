class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        
        first = nums[0]
        last = nums[len(nums) - 1]
        if first > last:
            prev = nums[0] 
            for i in range(len(nums) - 1):
                if nums[i + 1] > prev:
                    return False
                prev = nums[i + 1]
            return True
        elif last > first:
            prev = nums[0] 
            for i in range(len(nums) - 1):
                if nums[i + 1] < prev:
                    return False
                prev = nums[i + 1]
            return True
        else:
            prev = nums[0] 
            for i in range(len(nums) - 1):
                if nums[i + 1] != prev:
                    return False
                prev = nums[i + 1]
            return True
