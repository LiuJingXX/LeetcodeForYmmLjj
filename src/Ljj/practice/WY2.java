package Ljj.practice;

import java.util.Scanner;

/**
 * @ClassName WY2
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/4/6 18:54
 * @Version 1.0
 **/
public class WY2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 0){
            n--;
            String s = sc.next();
            int len = s.length();
            StringBuilder sb = new StringBuilder();
            int i = 1;
            while(len >= 3*i){
                int num = Integer.parseInt(s.substring(len - 3*i,len - 3*i + 3));
                int t1 = num % 32;
                int t2 = num/32;
                sb.append(convert(t1));
                sb.append(convert(t2));
                i++;
            }
            int left = len - 3*i + 3;
            if(left > 0){
                int num = Integer.parseInt(s.substring(0,left));
                int t1 = num % 32;
                int t2 = num/32;
                sb.append(convert(t1));
                if(t2 != 0){
                    sb.append(convert(t2));
                }
            }
            System.out.println(sb.reverse().toString());
        }
    }
    private static Character convert(int n){
        if(n >= 0 && n <= 9){
            return (char)(n +'0');
        }else{
            return (char)('A' + n - 10);
        }
    }
}
