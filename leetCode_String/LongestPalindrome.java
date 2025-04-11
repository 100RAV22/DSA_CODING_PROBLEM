class LongestPalindrome{
    public static void main(String args[]){
        String str = "babad";
        System.out.println(palindrome(str));
    }
    public static String palindrome(String str){
        int n = str.length();
        if( n <= 1){
            return str;
        }
        boolean dp[][] = new boolean[n][n];
        int start = 0;
        int end = 0;
        int maxlen = 0;
        for(int i=0;i<n;i++){
            dp[i][i] = true;
            for(int j=0;j<i;j++){
                if(str.charAt(i) == str.charAt(j) && (i-j <= 2 || dp[j+1][i-1])){
                    dp[j][i] = true;
                    if(i-j+1 > maxlen){
                        maxlen = i-j+1;
                        start = j;
                        end = i;
                    }
                }
            }
        }
        return str.substring(start, end+1);
    }
}