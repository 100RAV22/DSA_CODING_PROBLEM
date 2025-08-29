public class TrappingRainWater {
    public static int TrapWater(int[] height){
        int n = height.length;
        // find left maximum
        int[] leftmax = new int[n];
        leftmax[0] = height[0];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }

        //find right maximum
        int[] rightmax = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }

        int Trap_Water = 0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            Trap_Water += waterLevel - height[i];
        }
        return Trap_Water;
    }
    public static void main(String args[]){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trapWater = TrapWater(height);
        System.out.println("Trappin Rain Water: "+ trapWater);
    }
}
