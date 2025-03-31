import java.util.*;
class marbleInBags{
    public static void main(String args[]){
        int weights[] = {1,3,5,1};
        int k=2;
        long res = scoreDifference(weights, k);
        System.out.println(res);
    }
    public static long scoreDifference(int weights[], int k){
        int n=weights.length;
        if(k == 0){
            return 0;
        }
        List<Integer> pairSums = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            pairSums.add(weights[i]+weights[i+1]);
        }
        Collections.sort(pairSums);
        long maxScore = 0;
        long minScore = 0;
        for(int i=0;i<k-1;i++){
            minScore += pairSums.get(i);
            maxScore += pairSums.get(pairSums.size()-1-i);
        }
        return maxScore - minScore;
    }
}