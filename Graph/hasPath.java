import java.util.*;
class hasPath{
    private static class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void main(String args[]){
        int arr[][]={{1,2},{0,2,3},{0,1,4},{1,4,5},{2,3,5},{3,4,6},{5}};

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[arr.length];
        createGraph(graph,arr);
        int src = 0;
        int dest = 5;
        boolean vis[] = new boolean[arr.length];
        if(isPathExit(graph, vis, src, dest)){
            System.out.println("Path exists");
        }else {
            System.out.println("Path does not exist");
        }
    }

    private static boolean isPathExit(ArrayList<Edge> graph[], boolean vis[], int src, int dest){
        if(src==dest){
            return true;
        }
        vis[src]=true;
        for(int i=0;i<graph[src].size();i++){
            int v = graph[src].get(i).dest;
            if(!vis[v] && isPathExit(graph, vis, v, dest)){
                return true;
            }
        }
        return false;
    }

    private static void createGraph(ArrayList<Edge> graph[], int arr[][]){
        for(int i=0;i<arr.length;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                graph[i].add(new Edge(i, arr[i][j]));
            }
        }
    }
}