class EqualSubsetSum{
    public static void main(String args[]){
        int[] nums = {1,5,11,5};
        boolean res = canPartition(nums);
        System.out.println(res);
    }
    private static boolean canPartition(int nums[]){
        int n = nums.length;
        int sum = 0;
        for(int a : nums){
            sum += a;
        }
        if(sum % 2 == 1){
            return false;
        }
        int target = sum/2;
        boolean dp[][] = new boolean[n+1][target+1];
        for(int i=0;i<=n;i++){
            dp[i][0] = true;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                if(j >= nums[i-1] && dp[i-1][j-nums[i-1]]){
                    dp[i][j] = true;
                }else if(dp[i-1][j]){
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][target];
    }
}