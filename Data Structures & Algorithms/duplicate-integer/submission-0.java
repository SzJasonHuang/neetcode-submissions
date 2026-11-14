class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>(); 
        
        for(int i = 0; i < nums.length; i++){
            if(count.get(nums[i]) != null) return true; 
            int cur = count.get(nums[i]) == null ? 1 : count.get(nums[i]) + 1; 
            count.put(nums[i], cur);
        }
        return false;
    }
}