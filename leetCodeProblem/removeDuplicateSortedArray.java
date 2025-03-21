// 26.Remove duplicate from sorted array
import java.util.*;
class removeDuplicateSortedArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the element of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res = removeDuplicate(arr, n);
        System.out.println(res);
        for(int i=0;i<res;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int removeDuplicate(int arr[], int n){
        int i=1;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[j-1]){
                arr[i++] = arr[j];
            }
        }
        return i;
    }
}