class NumberOfPowerfulInt{
    public static void main(String args[]){
        long start = 1, finish = 6000;
        int limit = 4;
        String s = "124";
        long res = CountNoOfPowerfulInteger(start, finish, limit, s);
        System.out.println(res);
    }
    public static long CountNoOfPowerfulInteger(long start, long finish, int limit, String s){
        return countUtil(finish, limit, s) - countUtil(start-1, limit, s);
    }
    private static long countUtil(long range, int limit, String s){
        String numStr = Long.toString(range);
        int prefixLen = numStr.length()-s.length();
        if(prefixLen < 0){
            return 0;
        }
        long dp[][] = new long[prefixLen+1][2];
        dp[prefixLen][0] = 1;
        dp[prefixLen][1] = numStr.substring(prefixLen).compareTo(s) >= 0 ? 1 : 0;
        for(int i=prefixLen-1;i>=0;i--){
            int curr = numStr.charAt(i)-'0';
            dp[i][0] = (limit+1)*dp[i+1][0];
            if(curr <= limit){
                dp[i][1] = (long)curr * dp[i+1][0]+dp[i+1][1];
            }else{
                dp[i][1] = (long)(limit+1)*dp[i+1][0];
            }
        }
        return dp[0][1];
    }
}