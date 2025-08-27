//Leetcode problem : 238

package DSA_CODING_PROBLEM.freeCodeCamp_leetcode;

public class ProductArrayExceptSelf {
    public static int[] ProductArr(int nums[]){
        int res[] = new int[nums.length];
        int pre = 1;
        int post = 1;
        for(int i=0;i<nums.length;i++){
            res[i] = pre;
            pre = pre * nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            res[i] = post * res[i];
            post = post * nums[i];
        }

        return res;
    }
    public static void main(String args[]){
        int[] nums = {1, 2, 3, 4};
        int res[] = ProductArr(nums);
        for(int n: res){
            System.out.print(n+" ");
        }
    }
}
