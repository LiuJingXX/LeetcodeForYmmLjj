package Ljj.nowcoder;

import java.util.Scanner;

/**
 * @ClassName Wangyi1
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/3/9 9:35
 * @Version 1.0
 **/
public class Wangyi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a,b;
        String s;
        while(n>0){
            int count = 0;
            a = sc.nextInt();
            b = sc.nextInt();
            s = sc.next();
            System.out.println(s);
            int start = 0;
            int len = b/a;
            boolean flag = false;
            for(int i = 0;i < s.length();i++){
                char t = s.charAt(i);
                if(start == len - 1&&isBiao(t)){
                    if(len > 1){
                        start = 0;
                        count++;
                        i++;
                    }else{
                        System.out.println("impossible");
                        flag = true;
                        break;
                    }
                }else if(start == len - 1){
                    start = 0;
                    count++;
                }else if(t == '\\'){
                    i++;
                    if(i == s.length() - 1){
                        break;
                    }
                    count++;
                    start = 0;
                }else{
                    start++;
                }
            }
            if(flag){
                continue;
            }
            System.out.println(count+1);
            n--;
        }

    }
    private static boolean isBiao(char y){
        if(y == ','||y == '!' ||y== '.'||y=='?'){
            return true;
        }else{
            return false;
        }
    }
}
