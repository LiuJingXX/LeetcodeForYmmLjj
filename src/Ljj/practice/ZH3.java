package Ljj.practice;

import java.util.Scanner;

/**
 * @ClassName ZH3
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/4/9 19:48
 * @Version 1.0
 **/
public class ZH3 {

    private static void process(int num,int[] v,int[] step){
        int p=num;
        int tmp=0;
        while(p<=100000){
            v[p]++;
            step[p]+=tmp++;
            p*=2;
        }
        tmp=1;
        while(num > 0){
            if(num%2==1&&num!=1){
                num/=2;
                v[num]++;
                step[num]+=tmp++;

                int ff=num*2;
                int ftemp=tmp;
                while(ff<=100000){
                    v[ff]++;
                    step[ff]+=ftemp++;
                    ff*=2;
                }
            }
            else{
                num/=2;
                v[num]++;
                step[num]+=tmp++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100000];
        int[] v = new int[100010];
        int[] step = new int[100010];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            process(a[i],v,step);
        }
        int out=1000000000;
        for(int i=1;i<=100000;i++){
            if(v[i]==n) out=Math.min(out,step[i]);
        }
        System.out.println(out);

    }

}
