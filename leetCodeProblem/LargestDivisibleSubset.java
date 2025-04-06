import java.util.*;
class LargestDivisibleSubset{
    public static void main(String args[]){
        int[] nums = {1,2,4,8};
        List<Integer> res = largestSubset(nums);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }

    }
    public static List<Integer> largestSubset(int nums[]){
        int n = nums.length;
        Arrays.sort(nums);
        int dp[] = new int[n];
        Arrays.fill(dp, 1);
        int prevIdx[] = new int[n];
        Arrays.fill(prevIdx, -1);
        int maxSize = 1;
        int maxIdx = 0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j] == 0){
                    if(dp[j]+1 > dp[i]){
                        dp[i] = dp[j]+1;
                        prevIdx[i] = j;
                    }
                }
            }
            if(dp[i] > maxSize){
                maxSize = dp[i];
                maxIdx = i;
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(maxIdx >= 0){
            ans.add(nums[maxIdx]);
            maxIdx = prevIdx[maxIdx];
        }
        Collections.reverse(ans);
        return ans;
    }
}