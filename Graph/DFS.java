import java.util.*;
class DFS{
    public static void main(String args[]){
        int arr[][] = { {2, 3, 1}, {0}, {0, 4}, {0}, {2} };
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int a[] : arr){
            ArrayList<Integer> list = new ArrayList<>();
            for(int num : a){
                list.add(num);
            }
            graph.add(list);
        }
        boolean vis[] = new boolean[arr.length];
        dfs(graph, vis, 0);
    }
    public static void dfs(ArrayList<ArrayList<Integer>> graph, boolean vis[], int curr){
        System.out.print(curr + " ");
        vis[curr] = true;
        for(int dest : graph.get(curr)){
            if(!vis[dest]){
                dfs(graph, vis, dest);
            }
        }
    }
}