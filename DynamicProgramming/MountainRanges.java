package DynamicProgramming;
import java.util.*;
public class MountainRanges {
    public static int Mountain_Valley(int n, int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            ans += Mountain_Valley(i, dp) * Mountain_Valley(n-1-i, dp);
        }
        return dp[n] = ans;
    }
    public static void main(String args[]){
        int n = 4;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        int res = Mountain_Valley(n, dp);
        System.out.println("No. of mountains and valleys: "+res);
    }
}
