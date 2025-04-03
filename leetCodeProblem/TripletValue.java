import java.util.*;
class TripletValue{
    public static void main(String args[]){
        int[] nums = {12,6,1,2,7};
        long res = maxTripletVal(nums);
        System.out.println(res);
    }
    public static long maxTripletVal(int nums[]){
        int n = nums.length;
        long maxVal = 0;

        int max_k[] = new int[n];
        max_k[n-1] =  nums[n-1];
        for(int i=n-2;i>=0;i--){
            max_k[i] = Math.max(max_k[i+1], nums[i]);
        }
        int max_i = nums[0];
        int maxDiff = Integer.MIN_VALUE;
        for(int i=1;i<n-1;i++){
            maxDiff = Math.max(maxDiff, max_i-nums[i]);
            maxVal = Math.max(maxVal, (long)maxDiff*max_k[i+1]);
            max_i = Math.max(max_i, nums[i]);
        }
        return maxVal;
    }
}