package Ljj.nowcoder;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * @ClassName PainterQ_TX3
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/2/25 18:51
 * @Version 1.0
 **/
public class PainterQ_TX3 {
    static char[][] chs = new char[50][50];
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for(int i = 0; i < n; i++) {
            String str = in.next();
            for(int j = 0; j < m; j++) {
                chs[i][j] = str.charAt(j);
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(chs[i][j] == 'B') {
                    dfs_B(i, j);
                    count++;
                } else if(chs[i][j] == 'Y') {
                    dfs_Y(i, j);
                    count++;
                } else if(chs[i][j] == 'G') {
                    dfs_B(i, j);
                    count++;
                    dfs_Y(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void dfs_B(int i, int j) {
        if(i >= 0 && i < n && j >= 0 && j < m && (chs[i][j] == 'B' || chs[i][j] == 'G')) {
            if(chs[i][j] == 'B') {
                chs[i][j] = 'X';
            } else if(chs[i][j] == 'G'){
                chs[i][j] = 'Y';
            }
            dfs_B(i + 1, j - 1);
            dfs_B(i - 1, j + 1);
        }
        return ;
    }

    private static void dfs_Y(int i, int j) {
        if(i >= 0 && i < n && j >= 0 && j < m && (chs[i][j] == 'Y' || chs[i][j] == 'G')) {
            if(chs[i][j] == 'Y') {
                chs[i][j] = 'X';
            } else if(chs[i][j] == 'G'){
                chs[i][j] = 'B';
            }
            dfs_Y(i - 1, j - 1);
            dfs_Y(i + 1, j + 1);
        }
        return ;
    }
}
