import java.util.*;
public class TrappingRainWater {
    public static int trappedrainWater(int height[])
    {
 
        // calc. left max boundary - array;
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];

        for(int i = 1; i < height.length; i++)
        {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calc. right max boundary - array;
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        
        for(int i = height.length - 2; i>= 0; i--)
        {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        

        // variable declear for trappedRainH2O
        int trappedWater = 0;
        //loop
        for(int i =0; i < height.length; i++)
        {
         int  Waterlevel = Math.min(leftMax[i], rightMax[i]);
         trappedWater += Waterlevel - height[i];
        }

 return trappedWater;
    }
    public static void main(String[] args)
    {
    int height[] = {4, 2, 0, 6, 3, 2, 5};
    System.out.println(trappedrainWater(height));
    }
    
}
