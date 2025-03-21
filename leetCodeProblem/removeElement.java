// 27. remove Element
import java.util.*;
class removeElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the element of array: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be removed:");
        int val = sc.nextInt();
        int res = remove(arr, val);
        System.out.println(res);
    }
    public static int remove(int arr[], int val){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=val){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        return i;
    }
}