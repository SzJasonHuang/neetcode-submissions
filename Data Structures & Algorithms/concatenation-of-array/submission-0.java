class Solution {
    public int[] getConcatenation(int[] nums) {
        //2x len of original
        int[] result = new int[nums.length * 2];
        for(int i = 0; i < nums.length; i++){
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }

        return result; 
    }
}