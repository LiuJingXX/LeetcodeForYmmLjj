package Ljj.nowcoder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName GetPower_JD1
 * @Description 给定整数n，求满足a^b=c^d的情况，其中abcd均小于n.
 * @Author LiuJJ
 * @Date 2019/1/10 17:02
 * @Version 1.0
 **/
public class GetPower_JD1 {
    private static long mod = 1000000007;
    public static long gdc(long a,long b){
        return (a%b == 0)?b:gdc(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = n*(2*n - 1)%mod;//不包含幂的总数
        Set<Integer> set = new HashSet<>();
        for(int i = 2;i*i < n;i++){
            if(set.contains(i)){ //已经遍历过的跳过
                continue;
            }
            long temp = i;
            long cnt = 0;
            while(temp <= n){ //算出x，y的值域，最大值cnt
                set.add((int)temp);
                temp *= i;
                cnt++;
            }
            for(int k = 1;k <= cnt;k++){ //遍历x，y
                for(int j = k + 1;j <= cnt;j++){
                    ans = (ans + n/(j/gdc(k,j))*(long)2)%mod;
                }
            }
        }
        System.out.println(ans);
    }
}
