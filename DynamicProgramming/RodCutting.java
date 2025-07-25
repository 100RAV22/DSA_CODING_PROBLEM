package DynamicProgramming;

public class RodCutting {
    public static int MaximumValue(int len[], int price[], int rodLength){
        int n=len.length;
        int dp[][]=new int[n+1][rodLength+1];

        for(int i=1;i<n+1;i++){
            for(int j=1;j<rodLength+1;j++){
                if(len[i-1] <= j){
                    dp[i][j] = Math.max(price[i-1]+dp[i][j-len[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][rodLength];
    }
    public static void main(String args[]){
        int len[] = {1,2,3,4,5,6,7,8};
        int price[] = {1,5,8,9,10,17,17,20};
        int rodLength = 8;
        
        int res = MaximumValue(len, price, rodLength);
        System.out.println("Maximum price for rod cutting : "+res);
    }
}
