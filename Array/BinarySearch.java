package Array;

public class BinarySearch{
    public static int binarySearch(int arr[], int si , int ei, int target){

        //RECURSIVE METHOD

        // if(si > ei){
        //     return -1;
        // }
        // int mid = si+(ei-si)/2;
        // if(arr[mid]== target){
        //     return mid;
        // }
        // if(arr[mid]>target){
        //     return binarySearch(arr, si, mid-1, target);
        // }else{
        //     return binarySearch(arr, mid+1, ei, target);
        // }

        while(si <= ei){
            int mid = si + (ei-si)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid] > target){
                ei = mid-1;
            }else {
                si = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14};
        int target = 8;
        int ans = binarySearch(arr, 0, arr.length-1, target);
        if(ans != -1)
            System.out.println(target + " is present at index : "+ans);
        else System.out.println(target + " is not present in arr");
    }
}