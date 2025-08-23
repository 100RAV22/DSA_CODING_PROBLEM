package Array;

public class KadanesAlgo {
    public static int kadanes(int[] arr){
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currsum += arr[i];
            maxSum = Math.max(currsum, maxSum);
            if(currsum < 0){
                currsum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String arg[]){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int ans = kadanes(arr);
        System.out.println(ans);
    }
    

}
