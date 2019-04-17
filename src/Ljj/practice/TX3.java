package Ljj.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName TX3
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/4/5 19:15
 * @Version 1.0
 **/
public class TX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Mon[] mons = new Mon[n];
        for(int i = 0;i < n;i++){
            mons[i] = new Mon(sc.nextInt());
        }
        for(int i = 0;i < n;i++){
            mons[i].setP(sc.nextInt());
        }
        System.out.println(solution(mons,n));
    }
    public static int solution(Mon[] mons,int n) {
        int result = mons[0].p;
        long tmp = mons[0].d;
        for (int i = 1; i < n - 1; i++) {
            if (tmp < mons[i].d) {
                tmp += mons[i].d;
                result += mons[i].p;
                if (i == n - 2 && tmp < mons[i + 1].d){
                    tmp += mons[i + 1].d;
                    result += mons[i + 1].p;
                }
            }else if (tmp < mons[i + 1].d && tmp + mons[i].d >= mons[i + 1].d) {
                tmp += mons[i].d;
                result += mons[i].p;
            }
        }
        return result;
    }
    static class Mon{
        int d;
        int p;
        public Mon(int d) {
            this.d = d;
        }
        public void setP(int p){
            this.p = p;
        }
    }
}
