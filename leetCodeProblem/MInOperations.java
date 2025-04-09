import java.util.*;
class MinOperations{
    public static void main(String args[]){
        int[] nums = {5,2,5,4,5};
        int k = 2;
        int res1 = minOpr_Brute(nums, k);
        System.out.println("Brute force approach: "+res1);
        int res2 = minOpr_Hash(nums, k);
        System.out.println("Using HashMap : "+res2);
    }

    public static int minOpr_Hash(int nums[], int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a: nums){
            if(a < k){
                return -1;
            }else if(a > k){
                map.put(a, map.getOrDefault(a,0)+1);
            }
        }
        return map.size();
    }
    public static int minOpr_Brute(int[] nums, int k){
        Arrays.sort(nums);
        int min = nums[0];
        if(min < k){
            return -1;
        }
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > k){
                count++;
                while(i+1 < nums.length && nums[i]==nums[i+1]){
                    i++;
                }
            }
        }
        return count;
    }
}