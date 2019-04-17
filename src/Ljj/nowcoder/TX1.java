package Ljj.nowcoder;

import java.util.Scanner;

/**
 * @ClassName TX1
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/3/9 19:53
 * @Version 1.0
 **/
public class TX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int w = sc.nextInt();
            int h = sc.nextInt();
            int w1 = sc.nextInt();
            int h1 = sc.nextInt();
            int w2 = sc.nextInt();
            int h2 = sc.nextInt();
            while(h > 0){
                w += h;
                if(h == h1){
                    w = w - w1;
                    if(w < 0){
                        w = 0;
                    }
                }
                if(h == h2){
                    w = w - w2;
                    if(w < 0){
                        w = 0;
                    }
                }
                h--;
            }
            System.out.println(w);
        }
    }
}
