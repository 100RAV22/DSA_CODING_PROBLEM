package DynamicProgramming;
import java.util.*;
public class CountingTrees {
    public static int CountingBST(int n, int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int count = 0;
        for(int i=0;i<n;i++){
            count += CountingBST(i, dp) * CountingBST(n-i-1, dp);
        }
        return dp[n] = count;
    }
    public static void main(String args[]){
        int n=3;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        int res = CountingBST(n, dp);
        System.out.println("NO.of BST : "+CountingBST(n, dp));
    }
}
