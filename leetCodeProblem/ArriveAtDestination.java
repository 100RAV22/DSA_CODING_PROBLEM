// leetcode problem no : 1976
import java.util.*;
class ArriveAtDestination{
    public static final int MOD = 1000000007;
    public static int numberOfWays(int n , int roads[][]){
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int road[] : roads){
            graph.get(road[0]).add(new int[]{road[1], road[2]});
            graph.get(road[1]).add(new int[]{road[0], road[2]});
        }

        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a->a[0]));
        long dist[] = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        int ways[] = new int[n];
        dist[0] = 0;
        ways[0] = 1;
        pq.offer(new long[]{0,0});

        while(!pq.isEmpty()){
            long curr[] = pq.poll();
            int u = (int)curr[1];
            long d = curr[0];
            if(d > dist[u]){
                continue;
            }
            for(int neighbor[] : graph.get(u)){
                int v = neighbor[0];
                long newDist = d+neighbor[1];
                if(newDist < dist[v]){
                    dist[v] = newDist;
                    ways[v] = ways[u];
                    pq.offer(new long[]{newDist, v});
                }else if(newDist == dist[v]){
                    ways[v] = (ways[u]+ways[v])%MOD;
                }
            }
        }
        return ways[n-1];
    }
    public static void main(String args[]){
        int n = 7;
        int roads[][] = {{0,6,7},{0,1,2},{1,2,3},{1,3,3},{6,3,3},{3,5,1},{6,5,1},{2,5,1},{0,4,5},{4,6,2}};
        int res = numberOfWays(n,roads);
        System.out.println("Number of ways to arrive at destinaiton : "+ res);
    }
}