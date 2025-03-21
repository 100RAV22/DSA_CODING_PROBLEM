//80. remove Duplicate element from sorted Array 2
import java.util.*;
class removeDupliSortedElementII{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the element of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res = removeDuplicateII(arr, n);
        System.out.println(res);
        for(int i=0;i<res;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int removeDuplicateII(int arr[], int n){
        if(n==0 || n<=2){
            return n;
        }
        int i=2;
        for(int j=2;j<n;j++){
            if(arr[j]!=arr[i-2]){
                arr[i]=arr[j];
                i++;
            }
        }
        return i;
    }
}