import java.util.*;
class BrainPower{
    public static void main(String args[]){
        int questions[][] = {{3,2},{4,3},{4,4},{2,5}};
        long res = mostPoint(questions);
        System.out.println(res);
    }
    public static long mostPoint(int questions[][]){
        int n = questions.length;
        long dp[] = new long[n+1];

        for(int i=n-1;i>=0;i--){
            long points = questions[i][0];
            int brainPower = questions[i][1];

            //solve 
            int nextIdx = i + brainPower + 1;
            long solve = points + (nextIdx < n ? dp[nextIdx] : 0);

            //skip
            long skip = dp[i+1];

            dp[i] = Math.max(skip, solve);
        }
        return dp[0];
    }
}