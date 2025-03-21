import java.util.*;
class mergeSortedArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the size of m: ");
        int m = sc.nextInt();
        int arr1[] = new int[n+m];
        System.out.println("Enter the elements of array1:");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[m];
        System.out.println("Enter the elements of array2:");
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }

        mergeArray(arr1, n, arr2, m);

        for(int i=0;i<n+m;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    public static void mergeArray(int arr1[], int n, int arr2[], int m){
        int i=n-1;
        int j=m-1;
        int k=arr1.length-1;
        while(i>=0 && j>=0){
            if(arr1[i]>arr2[j]){
                arr1[k]=arr1[i];
                k--;
                i--;
            }else{
                arr1[k] = arr2[j];
                k--;
                j--;
            }
        }
        while(i>=0){
            arr1[k]=arr1[i];
            k--;
            i--;
        }
        while(j>=0){
            arr1[k]=arr2[j];
            k--;
            j--;
        }
    }
}