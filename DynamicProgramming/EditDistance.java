package DynamicProgramming;

public class EditDistance {
    public static int totalOperation(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0){
                    dp[i][j] = j;
                }
                if(j==0){
                    dp[i][j] = i;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    int insert = dp[i][j-1]+1;
                    int remove = dp[i-1][j]+1;
                    int replace = dp[i-1][j-1]+1;
                    dp[i][j] = Math.min(insert, Math.min(remove, replace));
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String args[]){
        String s1 = "intention";
        String s2 = "execution";
        int res = totalOperation(s1, s2);
        System.out.println("Total number of operation : "+ res);
    }
}
