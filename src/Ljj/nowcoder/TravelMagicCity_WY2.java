package Ljj.nowcoder;

/**
 * @ClassName TravelMagicCity_WY2
 * @Description 深度优先队列
 * @Author LiuJJ
 * @Date 2019/1/14 15:46
 * @Version 1.0
 **/
public class TravelMagicCity_WY2 {
    private static int getMaxCity(int n,int l,int[] p){
        int[] dp = new int[n+1];
        int mx = 0;
        for(int i = 0;i < n - 1;i++){
            dp[i + 1] = dp[p[i]] + 1;
            mx = Math.max(mx,dp[i + 1]);
        }
        int s = Math.min(l,mx);
        return Math.min(n,1 + s + (l - s)/2);
    }

    public static void main(String[] args) {
        System.out.println(getMaxCity(5,2,new int[]{0,1,2,3}));
    }
}
