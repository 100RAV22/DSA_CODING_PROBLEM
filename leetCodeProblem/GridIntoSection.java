import java.util.*;
class GridIntoSection{
    public static void main(String args[]){
        int n = 5;
        int[][] rectangles = {{1,0,5,2},{0,2,2,4},{3,2,5,3},{0,4,4,5}};
        boolean res = canCut(rectangles, 0) || canCut(rectangles, 1); //0->x-axis and 1->y-axis
        System.out.println(res);
    }
    public static boolean canCut(int[][] rectangles, int axis){
        Arrays.sort(rectangles, Comparator.comparingInt(a->a[axis]));
        int cuts = 0;
        int previousEnd = -1;
        for(int rect[] : rectangles){
            int start = rect[axis];
            int end = rect[axis+2];
            if(start >= previousEnd){
                cuts++;
            }
            previousEnd = Math.max(previousEnd, end);
            if(cuts >= 3){
                return true;
            }
        }
        return false;
    }
}