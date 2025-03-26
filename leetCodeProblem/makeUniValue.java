import java.util.*;
class makeUniValue{
    public static void main(String args[]){
        int[][] grid = {{2,4},{6,8}}; 
        int x = 2;
        int res = MinOpr(grid, x);
        System.out.println("Min operation to make uni value : "+ res);
    }
    public static int MinOpr(int grid[][], int x){
        List<Integer> list = new ArrayList<>();

        for(int row[]: grid){
            for(int val: row){
                list.add(val);
            }
        }
        Collections.sort(list);
        int min = list.get(0);
        for(int val: list){
            if(Math.abs(val-min)%x != 0){
                return -1;
            }
        }
        int opr = 0;
        int median = list.get(list.size()/2);
        for(int val : list){
            opr += Math.abs(val-median)/x;
        }
        return opr;
    }
}