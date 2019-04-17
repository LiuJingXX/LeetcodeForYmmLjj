package Ljj.nowcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName TT4
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/3/16 10:46
 * @Version 1.0
 **/
public class TT4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int n = in.nextInt();
            int m = in.nextInt();
            double[] a = new double[n];
            for(int i = 0;i < n;i++){
                a[i] = in.nextInt();
            }
            double l = 0,r = 200005.0;
            for(int i = 0;i < 1000;i++){
                double mid = (l+r)/2;
                if(isSuit(mid,n,m,a)){
                    l = mid;
                }else{
                    r = mid;
                }
            }

            System.out.println(String.format("%.2f",r*100/100));
        }
    }
    private static boolean isSuit(double d,int n,int m,double[] a){
        int q = 0;
        for(int i = 0;i < n;i++){
            q += (int)(a[i]/d);
        }
        return q >= m;
    }
}
