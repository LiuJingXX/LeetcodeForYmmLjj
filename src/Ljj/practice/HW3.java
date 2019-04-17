package Ljj.practice;

import java.util.Scanner;

/**
 * @ClassName HW3
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/4/10 18:41
 * @Version 1.0
 **/
public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        boolean[][] b = new boolean[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int w = sc.nextInt();
        int h = sc.nextInt();
        int w1 = sc.nextInt();
        int h1 = sc.nextInt();
        long result = search(a,b,0,w,h,w1,h1);
        //long result = count % 1000000000;
        result = result%1000000000;
        System.out.println((int)result);
    }
    private static long search(int[][] a,boolean [][] b,int level,int w,int h,int w1,int h1){
        if(w1 == w && h1 == h){
            //add();
            return 1;
        }
        if(w < 0 || w >= a.length || h < 0 || h >= a[0].length || b[w][h] || a[w][h] < level){
            return 0;
        }
        b[w][h] = true;
        //search(a,b,a[w][h],w + 1,h,w1,h1);
        //search(a,b,a[w][h],w - 1,h,w1,h1);
        //search(a,b,a[w][h],w,h + 1,w1,h1);
        //search(a,b,a[w][h],w,h - 1,w1,h1);
        long res = search(a,b,a[w][h],w + 1,h,w1,h1);
        long res2 = search(a,b,a[w][h],w - 1,h,w1,h1);
        long res3 = search(a,b,a[w][h],w,h + 1,w1,h1);
        long res4 = search(a,b,a[w][h],w,h - 1,w1,h1);
        res %= 1000000000;
        res2 %= 1000000000;
        res3 %= 1000000000;
        res4 %= 1000000000;
        b[w][h] = false;
        return res + res2 + res3 + res4;
    }
}
