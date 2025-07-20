package DynamicProgramming;

public class fibbonacci {
    //Recurssive approch
    public static int fibbo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibbo(n-1)+fibbo(n-2);
    }
    public static int fibbo_dp(int n, int dp[]){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n] = fibbo_dp(n-1, dp)+fibbo_dp(n-2, dp);
        return dp[n];
    }
    public static void main(String args[]){
        int n = 6;
        //recurssive approach
        System.out.println("recurssive: " +fibbo(n));

        //dp approach
        int dp[] = new int[n+1];
        System.out.println("dp : " + fibbo_dp(n, dp));
    }
}
