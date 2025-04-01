class HouseRobber{
    public static void main(String args[]){
        int[] nums = {2,7,9,3,1};
        int res = MaxRobber(nums);
        System.out.println(res);
    }
    public static int MaxRobber(int nums[]){
        int n = nums.length;
        int dp[] = new int[n+1];

        for(int i=n-1;i>=0;i--){
            //robber
            int nextIdx = i+1+1;
            int rob = nums[i] + (nextIdx < n ? dp[nextIdx] : 0);
            //not robber
            int notRob = dp[i+1];

            dp[i] = Math.max(rob, notRob);
        }
        return dp[0];
    }
}