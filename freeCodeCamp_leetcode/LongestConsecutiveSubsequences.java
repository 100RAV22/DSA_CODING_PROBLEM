// leetcode problem : 128

package DSA_CODING_PROBLEM.freeCodeCamp_leetcode;

import java.util.HashSet;

public class LongestConsecutiveSubsequences {
    public static int longestConsecutive(int nums[]){
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int longest_cons = Integer.MIN_VALUE;
        for(int num: set){
            if(set.contains(num-1)){
                continue;
            }else{
                int consecutive = 1;
                int curr = num;
                while(set.contains(curr+1)){
                    consecutive++;
                    curr++;
                }
                longest_cons = Math.max(consecutive, longest_cons);
            }
        }
        return longest_cons;
    }
    public static void main(String args[]){
        int[] nums = {100, 4, 200, 3, 2, 1};
        System.out.println("Longest consecutive subsequences: "+ longestConsecutive(nums));
    }
}
