//Leetcode problem: 347

package DSA_CODING_PROBLEM.freeCodeCamp_leetcode;
import java.util.*;
public class TopKFrequentEle {
    public static int[] frequentEle(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
            (a, b)-> map.get(a)-map.get(b)
        );

        for(int n: map.keySet()){
            heap.add(n);
            if(heap.size() > k){
                heap.poll();
            }
        }
        int res[] = new int[k];
        for(int i=0;i<k;i++){
            res[i] = heap.poll();
        }
        return res;

    }

    public static void main(String args[]){
        int[] nums = {1,1,1,2,2,3};
        int k=2;
        int res[] = frequentEle(nums, k);
        for(int i=0;i<k;i++){
            System.out.print(res[i]+" ");
        }
    }
    
}
