class AllSubsetXor{
    public static void main(String args[]){
        int nums[] = {5,6,1};
        int res = dfs(nums, 0, 0);
        System.out.println(res);
    }
    private static int dfs(int[] nums, int idx, int currXor){
        if(idx == nums.length){
            return currXor;
        }
        //include
        int inc = dfs(nums, idx+1, currXor ^ nums[idx]);
        //exclude
        int exc = dfs(nums, idx+1, currXor);

        return inc + exc;
    }
}