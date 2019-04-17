package Ljj.nowcoder;

import java.util.Scanner;

/**
 * @ClassName WY2
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/3/17 21:20
 * @Version 1.0
 **/
public class WY2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int h = scanner.nextInt();
            int[][] dp = new int[2][1020];
            int dep = 0;
            int ans = 0;
            dp[0][h] = 0;
            for (int i = 0; i < n; ++i) {
                dep ^= 1;
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int z = scanner.nextInt();
                for (int j = 0; j <= h; ++j) {
                    dp[dep][j] = -1;
                }
                for (int j = h; j >= 1; --j) {
                    if (j - x > 0 && dp[dep ^ 1][j] != -1)
                        dp[dep][j - x] = Math.max(dp[dep][j - x], dp[dep ^ 1][j] + y);
                    if (j - z > 0 && dp[dep ^ 1][j] != -1)
                        dp[dep][j - z] = Math.max(dp[dep][j - z], dp[dep ^ 1][j]);
                    if (dp[dep ^ 1][j] != -1)
                        ans = Math.max(ans, dp[dep ^ 1][j] + y);
                    if (dp[dep ^ 1][j] != -1)
                        ans = Math.max(ans, dp[dep ^ 1][j]);
                }
                for (int j = 0; j <= h; ++j) {
                    ans = Math.max(ans, dp[dep][j]);
                }
            }
            System.out.println(Math.max(ans, 0));
        }
    }
}