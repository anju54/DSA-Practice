package Stack;

public class ContainerWithMostWater11 {

    // TC - O( n)   SC - O( 1 )
    public static int maxArea(int[] height) {
        int max = 0;
        int start = 0; int end = height.length-1;

        while(start<end){
            int area = Math.min(height[start],height[end]) * (end-start);
            if(max<area){
                max = area;
            }
            if(height[start]<height[end])
                start++;
            else
                end--;
        }
        return max;
    }
    public static void main(String[] args) {

        int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println( maxArea(arr) );

    }
}
