package Array;
import java.util.ArrayList;
public class SubArray {
    public static ArrayList<ArrayList<Integer>> subArray(int[] arr){
        ArrayList<ArrayList<Integer>> subarrays = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                ArrayList<Integer> subarray = new ArrayList<>();
                for(int k=i; k<=j; k++){
                    subarray.add(arr[k]);
                }
                subarrays.add(subarray);
            }
        }
        return subarrays;
    }
    public static void main(String args[]){
        int[] arr = {2,4,6,8,10};
        ArrayList<ArrayList<Integer>> subarrays = subArray(arr);
        System.out.println("Total number of subarrays are: "+ subarrays.size());
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for(ArrayList<Integer> subarray : subarrays){
            System.out.print(subarray +" = ");

        // sum of subarray
            int sum = 0;
            for(int a : subarray){
                sum += a;
            }
            System.out.println( sum);

        // find minimum and maximum sum of subarrays
            minSum = Math.min(sum, minSum);
            maxSum = Math.max(sum, maxSum);

        }
        
        System.out.println("Maximum sum of array is : "+ maxSum);
        System.out.println("Minimum sum of array is : "+ minSum);
    }
}
