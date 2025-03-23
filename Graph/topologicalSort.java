import java.util.*;



class topologicalSort{
    static class Edge{
    int src;
    int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void main(String args[]){
        int V = 6; // Number of vertices
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Adding edges to the graph
        graph.get(5).add(new Edge(5, 0));
        graph.get(5).add(new Edge(5, 2));
        graph.get(2).add(new Edge(2, 3));
        graph.get(3).add(new Edge(3, 1));
        graph.get(4).add(new Edge(4, 1));
        graph.get(4).add(new Edge(4, 0));

        kanhsAlgo(graph, V);
    }
    public static void kanhsAlgo(ArrayList<ArrayList<Edge>> graph, int v){
        int indeg[] = new int[v];
        calIndeg(graph,indeg);
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        //bfs
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+" ");
            for(int i=0;i<graph.get(curr).size();i++){
                Edge e = graph.get(curr).get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }
    public static void calIndeg(ArrayList<ArrayList<Edge>> graph, int indeg[]){
        for(int i=0;i<graph.size();i++){
            int v = i;
            for(int j=0;j<graph.get(i).size();j++){
                Edge e = graph.get(i).get(j);
                indeg[e.dest]++;
            }
        }
    }
}