package Ljj.practice;

import java.util.Scanner;

/**
 * @ClassName TX2
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/4/5 19:15
 * @Version 1.0
 **/
public class TX2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        if(n == 0 || s.length() < 1){
            System.out.println(0);
            return;
        }
        int a = 0,b = 0;
        for(int i = 0;i < n;i++){
            if(s.charAt(i) == '0'){
                a++;
            }else{
                b++;
            }
        }
        if(a>b){
            System.out.println(a - b);
        }else{
            System.out.println(b - a);
        }
    }
}
