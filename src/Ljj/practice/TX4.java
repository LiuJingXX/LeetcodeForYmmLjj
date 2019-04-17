package Ljj.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName TX4
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/4/5 19:15
 * @Version 1.0
 **/
public class TX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        a[n] = 0;
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int sum = 0;
        int ans = 0;
        int i;
        if (a[1] != 1) {
            System.out.println(-1);
            return ;
        }
        while (true) {
            if (sum >= m) {
                System.out.println(ans);;
                return ;
            }
            for (i = n; i >= 1; i--) {
                if (a[i] <= sum + 1) {
                    sum += a[i];
                    ans++;
                    break;
                }
            }
        }
    }
}
