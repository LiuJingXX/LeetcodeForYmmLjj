package Ljj.nowcoder;

import java.util.Scanner;

/**
 * @ClassName TT2
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/3/16 10:14
 * @Version 1.0
 **/
public class TT2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-->0) {//注意while处理多个case
            String s = in.next();
            if(s.length() < 1){
                return ;
            }
            int t = 1;
            int u = 0;
            char c = s.charAt(0);
            StringBuilder sb = new StringBuilder();
            for(int i = 1;i < s.length();i++){
                if(s.charAt(i) == c){
                    t++;
                }else{
                    if(u == 2){
                       t = 1;
                    }else if(t>2){
                        t = 2;
                    }
                    for(int j = 0;j < t;j++){
                        sb.append(c);
                    }
                    u = t;
                    t = 1;
                    c = s.charAt(i);
                }
            }
            if(u == 2){
                t = 1;
            }else if(t>2){
                t = 2;
            }
            for(int j = 0;j < t;j++){
                sb.append(c);
            }
            System.out.println(sb.toString());
        }
    }
}
