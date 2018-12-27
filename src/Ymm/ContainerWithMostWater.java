package Ymm;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        if(height.length==2) return Math.min(height[0],height[1]);
        int right=0,left=height.length-1;
        int n=0;
        while (right<left){
            n=Math.max(n,(Math.min(height[left],height[right]))*(left-right));
            if(height[left]<height[right]) left--;
            else right++;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] h={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(h));
    }
}
