class GoodINteger{
    static final int MOD = 1_000_000_007;
    public static void main(String args[]){
        int n = 50;
        System.out.println("Number of Good Integer : "+countGoodNumber(n));
    }
    public static int countGoodNumber(long n){
        long evenCount = (n+1)/2;
        long oddCount = n/2;
        long evenWays = power(5, evenCount);
        long oddWays = power(4, oddCount);
        return (int)((evenWays * oddWays) % MOD);
    }
    private static long power(long base, long exp){
        if(exp == 0){
            return 1;
        }
        long half = power(base, exp/2);
        long result = (half * half) % MOD;
        if(exp % 2 == 1){
            result = (result * base) % MOD;
        }
        return result;
    }
}