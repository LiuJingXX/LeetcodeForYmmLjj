package Ljj.nowcoder;

import java.math.BigInteger;

/**
 * @ClassName CombinationOfSong_TX1
 * @Description 输入第一行是歌单长度，第二行4个数为歌单A长度、数量；歌单B长度、数量。
 * 求能凑成的不同歌单种类
 * @Author LiuJJ
 * @Date 2019/1/9 11:29
 * @Version 1.0
 **/
public class CombinationOfSong_TX1 {
    static long[][] arr = new long[101][101];
    private static void init(){
        arr[0][0] = 1;
        for(int i = 1;i <= 100;i++){
            arr[i][0] = 1;
            for(int j = 1;j <= 100;j++){
                arr[i][j] = (arr[i-1][j-1] + arr[i - 1][j])%1000000007;
            }
        }
    }

    private static long getComb(int k,int a,int x,int b,int y){
        long ans = 0;
        for(int i = 0;i <= x;i++){
            int s = k - i*a;
            if(s >= 0 && s%b == 0 && s/b <= y){
                ans = (ans + arr[x][i]*arr[y][s/b]%1000000007)%1000000007;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        init();
        System.out.println(arr[1][0]);
        System.out.println(getComb(5,2,3,3,3));
    }
}
