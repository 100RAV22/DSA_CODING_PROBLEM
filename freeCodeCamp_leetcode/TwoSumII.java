// leetcode problem : 167

class TwoSumII {
    public static int[] twoSumII(int[] nums, int target){
       //using two pointer approach : there is a sorted array given 
       int left = 0;
       int right = nums.length-1;
       while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                return new int[]{left+1, right+1};
            }
            if(sum < target){
                left++;
            }else if(sum > target){
                right--;
            }
       }
       return new int[]{-1};
    }
    public static void main(String args[]){
        int[] nums = {2,3,4};
        int target = 6;
        int[] res = twoSumII(nums, target);
        for(int n: res){
            System.out.print(n+ " ");
        }
    }
}