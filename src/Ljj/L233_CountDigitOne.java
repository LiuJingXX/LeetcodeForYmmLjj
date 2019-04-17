package Ljj;

/**
 * @ClassName L233_CountDigitOne
 * @Description 给定一个整数 n，计算所有小于等于 n 的非负整数中数字 1 出现的个数。
 * @Author LiuJJ
 * @Date 2019/1/16 16:26
 * @Version 1.0
 **/
public class L233_CountDigitOne {
    private static int countOne(int n){
        int count = 0;
        for(long i = 1;i <= n;i = 10*i){
            long r = n/i,m = n%i;
            count += (r + 8)/10*i + (r%10 == 1?m + 1:0);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOne(100));
        System.out.println(countOne(9999));
    }
}
