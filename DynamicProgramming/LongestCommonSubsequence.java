package DynamicProgramming;
import java.util.*;
public class LongestCommonSubsequence {
    
    public static int LCS_Recursive(String str1, int n, String str2, int m){
        if(n==0 || m==0){
            return 0;
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return LCS_Recursive(str1, n-1, str2, m-1)+1;
        }else{
            int ans1 = LCS_Recursive(str1, n-1, str2, m);
            int ans2 = LCS_Recursive(str1, n, str2, m-1);
            return Math.max(ans1, ans2);
        }
    }

    public static int LCS_DP(String str1, int n, String str2, int m, int[][] dp){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return dp[n][m] = LCS_DP(str1, n-1, str2, m-1, dp) + 1;
        }else{
            int ans1 = LCS_DP(str1, n-1, str2, m, dp);
            int ans2 = LCS_DP(str1, n, str2, m-1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }
    public static void main(String args[]){
        String str1 = "abcdge";
        int n = str1.length();
        String str2 = "abedg";
        int m = str2.length();

        //recursive approach
        int res = LCS_Recursive(str1, n, str2, m);
        System.out.println("longest common Subsequence: "+ res);

        //Dynamic approach
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println("DP: " + LCS_DP(str1, n, str2, m, dp));
    }
}
