package Ljj;

import java.util.Scanner;

/**
 * @ClassName ZH3
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/3/17 20:05
 * @Version 1.0
 **/
public class ZH3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int n = in.nextInt();
            long[] a = new long[n];
            long min = 1000000000,max = -1000000000;
            int a1 = 0,a2 = 0;
            long sum = 0;
            for(int i = 0;i < n;i++){
                a[i] = in.nextInt();
                sum += Math.abs(a[i]);
                if(a[i] > max){
                    max = a[i];
                }
                if(a[i] < min){
                    min = a[i];
                }
                if(a[i]<=0){
                    a1++;
                }
                if(a[i]>=0){
                    a2++;
                }
            }
            if(n == 1){
                System.out.println(a[1]);
            }else{
                if(a1 == n){
                    sum += 2*max;
                }else if(a2 == n){
                    sum -= 2*min;
                }
                System.out.println(sum);
            }
        }
    }
}
