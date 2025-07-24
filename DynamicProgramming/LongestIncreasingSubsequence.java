package DynamicProgramming;

import java.util.HashSet;
import java.util.Arrays;
public class LongestIncreasingSubsequence {
    public static int LIS(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }
        int arr2[] = new int[set.size()];
        int i=0;
        for(int a: set){
            arr2[i] = a;
            i++;
        }
        Arrays.sort(arr2);
        return LCS(arr, arr2);
    }
    public static int LCS(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int dp[][] = new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(arr1[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String args[]){
        int arr[] = {50,3,10,7,10,80};
        int res = LIS(arr);
        System.out.println("longest increasing subsequence: "+ res);
    }
}
