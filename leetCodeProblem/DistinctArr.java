import java.util.*;
class DistinctArr{
    public static void main(String args[]){
        int[] nums = {1,2,3,4,2,3,3,5,7};
        int min = MinOpr(nums);
        System.out.println(min);
    }
    private static int MinOpr(int nums[]){
        int n = nums.length;
        int start = 0;
        int opr = 0;
        while(start < n){
            HashSet<Integer> set = new HashSet<>();
            boolean hasDuplicate = false;
            for(int i=start;i<n;i++){
                if(!set.add(nums[i])){
                    hasDuplicate = true;
                    break;
                }
            }
            if(!hasDuplicate){
                break;
            }
            start += 3;
            opr++;
        }
        return opr;

    }

}