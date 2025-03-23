import java.util.*;
class Dijakstra {
    
    public static void main(String args[]){
        int n = 6;
        int paths[][] = {{0,1,2},{0,2,4},{1,2,1},{1,3,7},{2,4,3},{3,5,1},{4,3,2},{4,5,5}};
        int dist[] = ShortestPathToAllVertices(n, paths);
        System.out.println("shortest distance of every node:");
        for(int d: dist){
            System.out.print(d+" ");
        }
    }
    public static int[] ShortestPathToAllVertices(int n, int paths[][]){
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int path[]: paths){
            graph.get(path[0]).add(new int[]{path[1], path[2]});
            graph.get(path[1]).add(new int[]{path[0], path[2]});
        }

        int dist[] = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        int ways[] = new int[n];
        ways[0] = 1;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        pq.offer(new int[]{0,0});
        while(!pq.isEmpty()){
            int curr[] = pq.poll();
            int d = curr[0];
            int u = curr[1];
            if(d > dist[u]){
                continue;
            }
            for(int neighbor[] : graph.get(u)){
                int newDist = d+neighbor[1];
                int v = neighbor[0];
                if(newDist < dist[v]){
                    dist[v] = newDist;
                    ways[v] = ways[u];
                    pq.offer(new int[]{newDist, v});
                }
            }
        }
        return dist;
    }
}