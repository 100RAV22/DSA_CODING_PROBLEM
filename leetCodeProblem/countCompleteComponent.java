import java.util.*;
class countCompleteComponent{
    public static void main(String args[]){
        int n=6;
        int edges[][] = {{0,1},{0,2},{1,2},{3,4},{3,5}};
        int completeComponent = count(n, edges);
        System.out.println(completeComponent);
    }
    public static int count(int n, int edges[][]){
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int edge[] : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean vis[] = new boolean[n];
        int completeComponent = 0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                List<Integer> component = new ArrayList<>();
                dfs(graph, i, vis, component);
                if(!isComplete(component, graph)){
                    completeComponent++;
                }
            }
        }
        return completeComponent;
    }
    private static void dfs(List<List<Integer>> graph, int node, boolean vis[], List<Integer> component){
        vis[node] = true;
        component.add(node);
        for(int neighbor : graph.get(node)){
            if(!vis[neighbor]){
                dfs(graph, neighbor, vis, component);
            }
        }
    }
    private static boolean isComplete(List<Integer> component, List<List<Integer>> graph){
        int size = component.size();
        for(int node : component){
            if(graph.get(node).size() != size-1){
                return false;
            }
        }
        return true;
    }
}