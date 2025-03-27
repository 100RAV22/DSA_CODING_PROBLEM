//leet code problem No. : 2780
import java.util.*;
class minIdxValidSplit{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.addAll(Collections.nCopies(3,2));
        int res = minIndex(arr);
        System.out.println("min valid split index : "+res);
    }
    public static int minIndex(ArrayList<Integer> arr){
        int n = arr.size();
        //find majority element
        int majority = arr.get(0);
        int count = 1;
        for(int i=0;i<n;i++){
            if(count==0){
                majority = arr.get(i);
            }
            count += majority==arr.get(i)?1:-1;
        }

        //find occurence of majority element
        int totalcount = 0;
        for(int a : arr){
            totalcount += majority==a?1:0;
        }

        //find minimum index for valid split
        int leftcount = 0;
        for(int i=0;i<n-1;i++){
            if(arr.get(i)==majority){
                leftcount++;
            }
            int leftsize = i+1;
            int rightsize = n-leftsize;
            int rightcount = totalcount - leftcount;

            if(leftcount*2 > leftsize && rightcount*2 > rightsize){
                return i;
            }
        }
        return -1;
    }
}