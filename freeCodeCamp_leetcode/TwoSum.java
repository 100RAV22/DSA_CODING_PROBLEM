// Leetcode problem: 1

package DSA_CODING_PROBLEM.freeCodeCamp_leetcode;
import java.util.*;
public class TwoSum {
    public static int[] two_sum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int rem = target-nums[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String args[]){
        int[] nums = {3,2,4};
        int target = 6;
        int[] res= two_sum(nums, target);
        for(int i=0; i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
