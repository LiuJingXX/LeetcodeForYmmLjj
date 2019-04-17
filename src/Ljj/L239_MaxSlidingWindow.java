package Ljj;

/**
 * @ClassName L239_MaxSlidingWindow
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/2/23 18:49
 * @Version 1.0
 **/
public class L239_MaxSlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return nums;
        }
        int max = findMax(nums,0,k);
        int[] res = new int[nums.length - k + 1];
        res[0] = max;
        if(nums.length == k){
            return res;
        }
        for(int i = 1;i <= nums.length - k;i++){
            if(nums[i - 1] != max){
                max = Math.max(max,nums[i + k - 1]);
            }else{
                max = findMax(nums,i,k);
            }
            res[i] = max;
        }
        return res;
    }
    private static int findMax(int[] n,int start,int len){
        int max = Integer.MIN_VALUE;
        for(int i = start;i < start + len;i++){
            max = Math.max(n[i],max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1,-1};
        System.out.println(maxSlidingWindow(a,1));
    }
}
