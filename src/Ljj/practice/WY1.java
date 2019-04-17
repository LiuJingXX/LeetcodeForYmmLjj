package Ljj.practice;

import java.util.Scanner;

/**
 * @ClassName WY1
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/4/6 18:54
 * @Version 1.0
 **/
public class WY1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] m = new int[13];
            for(int i = 0;i < n;i++){
                String a = sc.next();
                if("A".equals(a)){
                    m[0]++;
                }else if("J".equals(a)){
                    m[10]++;
                }else if("Q".equals(a)){
                    m[11]++;
                }else if("K".equals(a)){
                    m[12]++;
                }else{
                    m[Integer.parseInt(a)-1]++;
                }
            }
            int sum = 0;
            for(int i = 0;i < 9;i++){
                int tmp = m[i]*m[i+1]*m[i+2]*m[i+3]*m[i+4];
                if(tmp == 0){
                    continue;
                }
                sum += tmp;
                for(int j = i+5;j < 13;j++){
                    if(m[j] == 0){
                        break;
                    }
                    tmp *= m[j];
                    sum += tmp;
                }
            }
            System.out.println(sum);
        }
    }
}
