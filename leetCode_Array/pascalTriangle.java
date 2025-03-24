//problem no. 119
import java.util.*;
class pascalTriangle{
    public static void main(String args[]){
        int n=4;
        List<Integer> row = new ArrayList<>(Collections.nCopies(n+1,1));
        getPascalTriangle(row,n);
        for(int num : row){
            System.out.print(num + " ");
        }
    }
    public static void getPascalTriangle(List<Integer> row, int n){
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                row.set(j, row.get(j-1)+row.get(j));
            }
        }
    }
}