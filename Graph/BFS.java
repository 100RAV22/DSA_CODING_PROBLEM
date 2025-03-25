import java.util.*;
class BFS{
    public static void main(String args[]){
        int arr[][] = { {2, 3, 1}, {0}, {0, 4}, {0}, {2} };
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for (int[] a : arr) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : a) {
                list.add(num);
            }
            graph.add(list);
        }

        boolean vis[] = new boolean[arr.length];
        bfs(graph, vis, 0);//0->src
    }
    public static void bfs(ArrayList<ArrayList<Integer>> graph, boolean vis[], int src){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int curr = q.poll();
            if(!vis[curr]){
                vis[curr]=true;
                System.out.print(curr + " ");
                for(int i : graph.get(curr)){
                    q.add(i);
                }
            }
        }
    }
}