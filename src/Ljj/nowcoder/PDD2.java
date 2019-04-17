package Ljj.nowcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName PDD2
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/3/10 16:48
 * @Version 1.0
 **/
public class PDD2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s0 = s.split(" ");
        int n = Integer.valueOf(s0[0]);
        int d = Integer.valueOf(s0[1]);
        int[][] ss = new int[n][2];
        for(int i = 0;i < n;i++){
            String s1 = scanner.nextLine();
            String[] s2 = s1.split(" ");
            ss[i][0] = Integer.valueOf(s2[0]);
            ss[i][1] = Integer.valueOf(s2[1]);
        }
        Arrays.sort(ss,(x,y)->(x[0]-y[0]));
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i = n-1;i>0;i--){
            if(max < ss[i][1]){
                max = ss[i][1];
            }
            dp1[i] = max;
        }
        max = Integer.MIN_VALUE;
        for(int i = 0;i < n;i++){
            if(max < ss[i][1]){
                max = ss[i][1];
            }
            dp2[i] = max;
        }
        int i = 0;
        max = Integer.MIN_VALUE;
        int start = 0;
        while(ss[i][0] + d <= ss[n-1][0]){
            while(ss[start][0] <ss[i][0] + d ){
                start++;
            }
            max = Integer.max(max,dp1[start]+dp2[i]);
            i++;
        }
        System.out.println(max);
    }
}
