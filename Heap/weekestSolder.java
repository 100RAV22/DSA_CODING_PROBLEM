//n weekest soldiers
import java.util.*;
class weekestSolder{
    static class Row implements Comparable<Row>{
        int count; 
        int idx;
        public Row(int c, int i){
            this.count = c;
            this.idx = i;
        }
        public int compareTo(Row R){
            if(this.count == R.count){
                return this.idx - R.idx;
            }else{
                return this.count - R.count;
            }
        }
    }

    public static void main(String args[]){
        int soldiers[][] = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i=0;i<soldiers.length;i++){
            int count = 0;
            for(int j=0;j<soldiers[i].length;j++){
                count += soldiers[i][j]==1?1:0;
            }
            pq.add(new Row(count, i));
        }

        for(int i=0;i<k;i++){
            System.out.println("Row No: "+ pq.remove().idx);
        }
    }
}