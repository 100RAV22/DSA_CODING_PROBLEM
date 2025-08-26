package Array;

public class TrappingRainWater {
    public static int trappedWater(int height[]){

        //left maximum array

        int[] leftmax = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }

        //right maximum array

        int[] rightmax = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }

        int trapWater = 0;
        for(int i=0;i<height.length;i++){
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            
            trapWater += (waterLevel - height[i]);
            
        }
        return trapWater;
    }
    public static void main(String args[]){
        int[] height = {4,2,0,6,3,2,5};
        int total_trapped_water = trappedWater(height);
        System.out.println("Total Trapped water : "+ total_trapped_water);
    }
}
