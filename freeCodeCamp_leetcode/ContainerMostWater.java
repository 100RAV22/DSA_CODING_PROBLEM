public class ContainerMostWater {
    public static int MostWater(int[] height){
        //using two pointer approch
        int left = 0;
        int right = height.length-1;
        int maxWater = 0;
        while(left < right){
            int ht = Math.min(height[left], height[right]);
            int width = right-left;
            int currWater = ht*width;
            maxWater = Math.max(currWater, maxWater);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        int[] height = {1,8,6,2,5,4,8,3,7};
        int res = MostWater(height);
        System.out.println("Maximum water: "+ res);
    }
}
