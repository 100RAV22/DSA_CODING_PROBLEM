class HeapSortDesc{
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
        //step 1 : build min heap
        for(int i=n/2;i>=0;i--){
            heapify(arr,n,i);
        }

        //step 2: push smallest at end
        for(int i=n-1;i>0;i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr,i,0);
        }
    }

    public static void heapify(int arr[], int size, int i){
        int minIdx = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left < size && arr[left] < arr[minIdx]){
            minIdx = left;
        }
        if(right < size && arr[right] < arr[minIdx]){
            minIdx = right;
        }
        if(minIdx != i){
            //swap
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
            heapify(arr, size, minIdx);
        }
    }
}