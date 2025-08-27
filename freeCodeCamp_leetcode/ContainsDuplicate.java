//Leetcode problem : 217

package DSA_CODING_PROBLEM.freeCodeCamp_leetcode;
import java.util.*;

public class ContainsDuplicate {
    public static boolean isContainDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }
    public static void main(String args[]){
        int[] nums = {1, 2, 3, 1};
        System.out.println(isContainDuplicate(nums));
    }
}
