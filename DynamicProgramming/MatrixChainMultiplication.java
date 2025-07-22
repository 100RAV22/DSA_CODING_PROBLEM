package DynamicProgramming;
import java.util.*;
public class MatrixChainMultiplication {
    public static int MCM(int arr[], int i, int j, int dp[][]){
        if(i==j){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        for(int k=i;k<j;k++){
            int cost1 = MCM(arr, i, k, dp);
            int cost2 = MCM(arr, k+1, j, dp);
            int cost3 = arr[i-1]*arr[k]*arr[j];
            int cost = cost1+cost2+cost3;
            ans = Math.min(ans, cost);
        }
        return dp[i][j] = ans;
    }
    public static void main(String args[]){
        int arr[] ={1,2,3,4,3};
        int n = arr.length;
        int dp[][] = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }
        int res = MCM(arr, 1, arr.length-1,dp);
        System.out.println("memoization : "+ res);
    }
}
