package Stack;

import java.util.Arrays;

public class RainWaterTrapping42 {

    public static int trap(int[] height) {

        if(height.length==0)
            return 0;

        int len = height.length;
        int maxR[] = new int[len];
        int maxL[] = new int[len];

        maxL[0] = height[0];
        for(int i=1;i<len;i++){
            maxL[i] = Math.max( maxL[i-1],height[i]);
        }

        System.out.println( "Max in left "+Arrays.toString(maxL));

        maxR[len-1] = height[len-1];
        for(int i=len-2;i>=0;i--){
           maxR[i] = Math.max(maxR[i+1],height[i]);
        }
        System.out.println("Max in right "+Arrays.toString(maxR));

        int minOfBothArr[] = new int[len];
        int sum = 0;
        for(int i=0;i<len;i++){
            minOfBothArr[i] = Math.min(maxL[i],maxR[i]);
            sum = sum + ( minOfBothArr[i] - height[i] );
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println( trap(arr) );

    }
}
