package Ljj.practice;

/**
 * @ClassName AL1
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/4/12 19:36
 * @Version 1.0
 **/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AL1 {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static String calculate(int m, int k) {
        String res = getM(m,k);
        String[] s = res.split(",");
        int year = getY(m);
        return s[0] + "," + year + "," + s[1];
    }
    static class Pig{
        int t;
        int num;
        public Pig(int i,int num){
            this.t = i;
            this.num = num;
        }
    }
    static String getM(int m,int s){
        if(m < 4){
            return m + 1 + "," ;
        }
        int i = 2,j = 3;
        int[] dp = new int[m + 1];
        Pig[] pigs = new Pig[m + 1];
        dp[1] = 2;
        dp[2] = 3;
        dp[3] = 4;
        pigs[0] = new Pig(0,1);
        pigs[1] = new Pig(1,2);
        pigs[2] = new Pig(2,3);
        pigs[3] = new Pig(3,4);
        for(int k = 4;k < m + 1;k++){
            dp[k] = dp[k - 2] + dp[k - 3];
            int tmp = Integer.valueOf(new StringBuilder(String.valueOf(dp[k])).reverse().toString());
            pigs[k] = new Pig(k,tmp);
        }
        Arrays.sort(pigs,(a,b)->(b.num - a.num));
        return dp[m] + "," + pigs[s - 1].t;
    }
    static int getY(int m){
        int i = 0, sum = 2;
        int[] d = new int[m];
        int[] s = new int[m];
        d[0] = 1;
        s[0] = 1;
        while (sum < m) {
            sum += d[i];
            i++;
            d[i] = d[i - 1] + s[i - 1];
            s[i] = sum - d[i];
        }
        return i + 2019;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(",");
        int m = Integer.valueOf(line[0]);
        int k = Integer.valueOf(line[1]);;
        System.out.println(calculate(m, k));

    }
}