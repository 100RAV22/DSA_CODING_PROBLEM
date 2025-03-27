import java.util.*;
class HeapSortAsc{
    public static void main(String args[]){
        int arr[] = {1,2,4,5,3};
        print(arr);
        heapSort(arr);
        print(arr);
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void heapSort(int arr[]){
        int n = arr.length;
        //step 1 : build maxheap
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }
        //step 2 : push largest at end
        for(int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,0,i);
        }
        
    }
    public static void heapify(int arr[], int i, int size){
        int maxInd = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left < size && arr[left] > arr[maxInd]){
            maxInd = left;
        }
        if(right < size && arr[right] > arr[maxInd]){
            maxInd = right;
        }
        if(maxInd != i){
            int temp = arr[i];
            arr[i] = arr[maxInd];
            arr[maxInd] = temp;
            heapify(arr, maxInd, size);
        }
    }

}