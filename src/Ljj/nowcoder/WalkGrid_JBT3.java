package Ljj.nowcoder;

import java.util.Scanner;

/**
 * @ClassName WalkGrid_JBT3
 * @Description  G社正在开发一个新的战棋类游戏，在这个游戏中，角色只能向2个方向移动：
 * 右、下。移动需要消耗行动力，游戏地图上划分M*N个格子，当角色移动到某个格子上时，行
 * 动力就会加上格子上的值K（-100~100），当行动力<=0时游戏失败，请问要从地图左上角移动
 * 到地图右下角至少需要多少起始行动力，注意（玩家初始化到起始的左上角格子时也需要消耗行动力）
 * @Author LiuJJ
 * @Date 2019/1/18 14:49
 * @Version 1.0
 **/
public class WalkGrid_JBT3 {
    private static int walk(int[][] a){
        int[][] dp = new int[a.length + 1][a[0].length + 1];
        dp[0][0] = a[0][0];
        for(int i = a.length - 1;i >= 0;i--){
            for(int j = a[0].length - 1;j >= 0;j--){
                dp[i][j] = Math.min(Math.max(dp[i][j + 1],1),Math.max(1,dp[i + 1][j])) - a[i][j];
            }
        }
        dp[0][0] = dp[0][0] > 1?dp[0][0]:1;
        return dp[0][0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(walk(a));
    }
}
