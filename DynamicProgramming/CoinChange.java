package DynamicProgramming;

public class CoinChange {
    public static int TotalWays(int coins[], int sum){
        int n = coins.length;
        int dp[][] = new int[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            dp[i][0] = 1;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coins[i-1] <= j){
                    dp[i][j] = dp[i][j-coins[i-1]]+dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String args[]){
        int coins[] = {2,5,3,6};
        int sum = 10;
        int res = TotalWays(coins, sum);
        System.out.println("Total ways : "+ res);
    }
}
