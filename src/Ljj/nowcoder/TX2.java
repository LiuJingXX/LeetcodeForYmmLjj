package Ljj.nowcoder;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

/**
 * @ClassName TX2
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/3/9 19:35
 * @Version 1.0
 **/
public class TX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.next();
            int len = s.length();
            int start = 0,end = len - 1,t = len - 1;
            char[] a = new char[len];
            if(len%2 == 0){
                a[t--] = s.charAt(end--);
            }
            while(start < end){
                a[t--] = s.charAt(start++);
                a[t--] = s.charAt(end--);
            }
            if(start == end){
                a[0] = s.charAt(start);
            }
            System.out.println(String.valueOf(a));
        }
    }
}
