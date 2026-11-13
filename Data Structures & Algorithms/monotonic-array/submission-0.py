class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        
        first = nums[0]
        last = nums[len(nums) - 1]
        if first > last:
            prev = i 
            for i in range(len(nums)):
                if nums[i + 1] < prev:
                    return False
                prev = nums[i + 1]
            return True
        elif last > first:
            prev = i 
            for i in range(len(nums)):
                if nums[i + 1] > prev:
                    return False
                prev = nums[i + 1]
            return True
        else:
            prev = i 
            for i in range(len(nums)):
                if nums[i + 1] != prev:
                    return False
                prev = nums[i + 1]
            return True
                
