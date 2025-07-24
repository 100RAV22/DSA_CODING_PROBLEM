package DynamicProgramming;
import java.util.*;
public class ClimbingStairs {
    public static int CountWays(int n, int[] dp){
        if(n==0 || n==1){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = CountWays(n-1, dp) + CountWays(n-2, dp);
        return dp[n];
    }
    public static void main(String args[]){
        int n = 4;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        int res = CountWays(n, dp);
        System.out.println("Total ways to climbing nth stairs : " + res);
    }
}
