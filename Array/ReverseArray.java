package Array;

public class ReverseArray {
    public static void reverseArray(int[] arr, int si, int ei){
        while(si < ei){
            //swap
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public static void main(String args[]){
        int[] arr = {2,4,6,8,10};
        reverseArray(arr, 0, arr.length-1);
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}
