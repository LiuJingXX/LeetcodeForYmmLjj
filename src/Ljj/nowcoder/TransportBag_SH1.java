package Ljj.nowcoder;

import java.util.Scanner;

/**
 * @ClassName TransportBag_SH1
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/2/25 21:07
 * @Version 1.0
 **/
public class TransportBag_SH1 {
    private static int trans(int[] n){
        int count = n[5] + n[4] + n[3] + (n[2] + 3)/4;
        int n3 = 4 - n[2]%4; //count of apart 3*3
        int n2 = n[3]*5 + n3*2-1;  //count of apart 2*2
        int n1 = 11*n[4] + n3 + 4;
        if(n2 >= n[1]){
            n1 += 4*(n2 - n[1]);
        }else{
            n[1] -= n2;
            count += (n[1] + 8)/9;
            n1 += (9 - n[1]%9)*4;
        }
        if(n1 < n[0]){
            count += (n[0] - n1 + 35)/36;
        }
        return count;
    }
    private static boolean isEnd(int[] n){
        for(int i = 0;i < 6;i++){
            if(n[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int[] n = new int[6];
            for(int i = 0;i < 6;i++){
                n[i] = sc.nextInt();
            }
            if(isEnd(n)){
                break;
            }
            System.out.println(trans(n));
        }
        sc.close();
    }
}
