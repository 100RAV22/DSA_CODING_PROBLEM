package DynamicProgramming;
import java.util.*;

public class CatalansNumber {
    public static int Catalans(int n, int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            ans += Catalans(i, dp)*Catalans(n-1-i, dp);
        }
        return dp[n] = ans;
        
    }
    public static void main(String args[]){
        int n=4;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        int res = Catalans(n, dp);
        System.out.println("Catalan's number : " + res);
        
    }
}
