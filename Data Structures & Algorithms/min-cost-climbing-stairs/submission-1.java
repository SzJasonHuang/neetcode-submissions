class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i < dp.length; i++){
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
                            //cost to go to the previous step + cost of previous step
                            //cost to go to the step before the previous one + cost of that
        }
        return dp[dp.length - 1];
    }
}
