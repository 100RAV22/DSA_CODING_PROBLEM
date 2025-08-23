package Array;

public class Prefix_maxSubarray {
    public static int prefix(int[] arr){
        int[] prefix_sum = new int[arr.length];
        int currsum = 0;
        prefix_sum[0] = arr[0];

        for(int i=1;i<arr.length;i++){
            prefix_sum[i] = prefix_sum[i-1]+arr[i];
        }
        
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum = i==0 ? prefix_sum[j] : prefix_sum[j]-prefix_sum[i-1];
            }
            maxSum = Math.max(currsum, maxSum);
        }
        return maxSum;
    }
    public static void main(String args[]){
        int[] arr = {2,4,6,8,10};
        int ans = prefix(arr);
        System.out.println("maximum sum of array : " + ans);
    }
}
