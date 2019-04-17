package Ljj.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName TX1
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/4/5 21:15
 * @Version 1.0
 **/
public class TX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for(int i = 1;i <= n;i++){
            a[i] = sc.nextInt();
        }
        a[0] = 0;
        Arrays.sort(a);
        int num = 0;
        int result = 0;
        if (a[1] != 1) {
            System.out.println(-1);
            return ;
        }
        while (true) {
            if (num >= m) {
                System.out.println(result);;
                return ;
            }
            for (int i = n; i >= 1; i--) {
                if (a[i] <= num + 1) {
                    num += a[i];
                    result++;
                    break;
                }
            }
        }
    }
}
