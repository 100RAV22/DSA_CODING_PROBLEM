import java.util.*;
class maxPoints{
    public static void main(String args[]){
        int grid[][] = {{1,2,3},{2,5,7},{3,5,1}};
        int queries[] = {5,6,2};
        int res[] = maxpoints(grid, queries);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] maxpoints(int grid[][], int queries[]){
        int n = grid.length;
        int m = grid[0].length;
        int k = queries.length;
        int answer[] = new int[k];

        int queryIdx[][] = new int[k][2];
        for(int i=0;i<k;i++){
            queryIdx[i] = new int[]{queries[i], i};
        }
        Arrays.sort(queryIdx, Comparator.comparingInt(a->a[0]));

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        int directions[] = {-1, 0, 1, 0, -1};
        boolean visited[][] = new boolean[n][m];

        minHeap.offer(new int[]{grid[0][0], 0, 0});
        visited[0][0] = true;
        int points = 0;

        for(int q[] : queryIdx){
            int queryValue = q[0];
            int idx = q[1];
            while(!minHeap.isEmpty() && minHeap.peek()[0] < queryValue){
                int cell[] = minHeap.poll();
                points++;
                int r = cell[1];
                int c = cell[2];
                for(int d=0;d<4;d++){
                    int nr = r + directions[d];
                    int nc = c + directions[d+1];
                    if(nr >= 0 && nr < n && nc >= 0 && nc < m && !visited[nr][nc]){
                        visited[nr][nc] = true;
                        minHeap.offer(new int[]{grid[nr][nc], nr, nc});
                    }
                }
            }
            answer[idx] = points;
        }
        return answer;
    }
}