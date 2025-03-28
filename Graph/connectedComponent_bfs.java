import java.util.*;
class connectedComponent_bfs{
    static class Edge{
        int src, dest;
        public Edge(int s, int e){
            this.src = s;
            this.dest = e;
        }
    }
    public static void main(String args[]){
        int arr[][]={{1,2},{0,2,3},{0,1,4},{1,4,5},{2,3,5},{3,4,6},{5}};
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[arr.length];

        

        for(int i=0;i<arr.length;i++){
            graph[i] = new ArrayList<>();
        }
        createGraph(graph, arr);

        boolean vis[] = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(!vis[i]){
                bfs(graph,vis,i);
            }
        }
    }
    
    public static void bfs(ArrayList<Edge>[] graph, boolean vis[], int src){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int curr = q.poll();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    private static void createGraph(ArrayList<Edge>[] graph, int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                graph[i].add(new Edge(i, arr[i][j]));
            }
        }
    }
}