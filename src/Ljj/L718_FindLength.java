package Ljj;

/**
 * @ClassName L718_FindLength
 * @Description 给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 * @Author LiuJJ
 * @Date 2019/1/17 10:21
 * @Version 1.0
 **/
public class L718_FindLength {
    private static int len(int[] a,int[] b){
        int len = 0;
        int[][] dp = new int[a.length + 1][b.length + 1];
        for(int i = 0;i < a.length;i++){
            for(int j = 0;j < b.length;j++){
                if(a[i] == b[j]){
                    dp[i+1][j+1] = dp[i][j]>0?dp[i][j] + 1:1;
                    len = Math.max(len,dp[i+1][j+1]);
                }
            }
        }
        return len;
    }
    public static int findLength(int[] A, int[] B) {
        int[] dp = new int[B.length+1];
        int max = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = B.length-1; j >=0 ; j--){
                if(A[i] == B[j]){
                    dp[j+1] = dp[j] + 1;
                    if(dp[j+1] > max)
                        max = dp[j+1];
                }
                else
                    dp[j+1] = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,2,1,2,3,5,76,4,1,23,4,1,6,8};
        int[] b = {3,2,1,4,5,9,5,7,3,8,3,5,7,98,45,3,2,2,};
        System.out.println(System.currentTimeMillis());
        System.out.println(len(a,b));
        System.out.println(System.currentTimeMillis());
        System.out.println(findLength(a,b));
        System.out.println(System.currentTimeMillis());
    }
}
