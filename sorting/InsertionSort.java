package sorting;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int prev = i-1;
            int curr = arr[i];
            while(prev >= 0 && curr < arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
