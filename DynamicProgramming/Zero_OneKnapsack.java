package DynamicProgramming;

public class Zero_OneKnapsack {
    public static int Zero_OneKnapsack_dp(int val[], int wt[], int W, int n, int dp[][]){
        if(n==0 || W==0){
            return 0;
        }
        if(wt[n-1] <= W){
            //include
            int ans1 = val[n-1] + Zero_OneKnapsack_dp(val, wt, W-wt[n-1], n-1, dp);
            //exclude
            int ans2 = Zero_OneKnapsack_dp(val, wt, W, n-1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        }else{
            //exclude
            dp[n][W] = Zero_OneKnapsack_dp(val, wt, W, n-1, dp);
            return dp[n][W];
        }

    }
    public static void main(String args[]){
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int n = val.length;
        int W = 7;
        int dp[][] = new int[n+1][W+1];
        int res = Zero_OneKnapsack_dp(val, wt, W, n, dp);
        System.out.println(res);

    }
}
