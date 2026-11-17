class Solution {
    public int rob(int[] nums) {
        //dp[0] = 0; init 
        //dp[1] = 1; rob first house
        //dp[2] = 1; rob last house or current house + the sum of all houses before the one adjacent to it
        //dp[3] = 3; r
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 2; i < dp.length; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        return dp[nums.length];
    }
}
