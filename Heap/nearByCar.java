import java.util.*;
class nearByCar{
    static class Point implements Comparable<Point>{
        int x, y;
        double dist;
        int idx;
        public Point(int x, int y, double dist, int i){
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.idx = i;
        }
        public int compareTo(Point p){
            return Double.compare(this.dist, p.dist);
        }
    }
    public static void main(String args[]){
        int cars[][] = {{3,3},{5,-1},{-2,4}};
        int k= 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0;i<cars.length;i++){
            int x = cars[i][0];
            int y = cars[i][1];
            double dist = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
            pq.add(new Point(x, y, dist, i));
        }
        for(int i=0;i<k;i++){
            System.out.println("Car at index : "+pq.remove().idx);
        }
    }
}