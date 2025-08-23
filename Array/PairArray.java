package Array;
import java.util.*;
public class PairArray {
    public static ArrayList<int[]> pairArray(int[] arr){
        ArrayList<int[]> pairs = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                pairs.add(new int[]{arr[i], arr[j]});
            }
        }
        return pairs;
    }
    public static void main(String args[]){
        int[] arr = {2,4,6,8,10};
        ArrayList<int[]> pairs = pairArray(arr);
        System.out.println("Total numbers of pairs : "+ pairs.size());
        System.out.println("pairs are: ");
        for(int i=0;i<pairs.size();i++){
            int[] pair = pairs.get(i);
            System.out.print("("+ pair[0] +", "+ pair[1]+") ");
        }
    }
}
