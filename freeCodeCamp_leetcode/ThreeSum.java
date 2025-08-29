//leetcode problem: 15

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> Three_Sum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length && nums[i]<=0 ;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                TwoSum(nums, i, result);
            }
        }
        return result;
    }
    public static void TwoSum(int[] nums, int i, List<List<Integer>> result){
        int left = i+1;
        int right = nums.length-1;
        while(left < right){
            int sum = nums[i]+nums[left]+nums[right];
            if(sum > 0){
                right--;
            }else if(sum < 0){
                left++;
            }else{
                result.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                while(left<right && nums[left]==nums[left-1]){
                    left++;
                }
            }
        }
    }
    public static void main(String args[]){
        int nums[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = Three_Sum(nums);
        System.out.println(result);
    }
}
