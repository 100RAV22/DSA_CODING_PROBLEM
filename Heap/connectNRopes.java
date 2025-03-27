import java.util.*;
class connectNRopes{
    public static void main(String args[]){
        int ropes[] = {2,3,4,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int rope : ropes){
            pq.add(rope);
        }

        int cost = 0;
        while(pq.size()>1){
            int rope1 = pq.poll();
            int rope2 = pq.poll();
            cost += rope1 + rope2;
            pq.add(rope1+rope2);
        }
        
        System.out.println("Minimum cost to connect n rope : " +cost);

    }
}