package DynamicProgramming;

public class TargetSumSubset {
    public static boolean isTargetSumSubset(int arr[], int target){
        int n = arr.length;
        boolean dp[][] = new boolean[n+1][target+1];
        for(int i=0;i<n+1;i++){
            dp[i][0] = true;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<target+1;j++){
                if(arr[i-1] <= j && dp[i-1][j-arr[i-1]]){
                    dp[i][j] = true;
                }else if(dp[i-1][j]){
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][target];
    }
    public static void main(String args[]){
        int arr[] = {4,2,7,1,3};
        int target = 10;
        boolean res = isTargetSumSubset(arr, target);
        System.out.println(res);
    }
}
