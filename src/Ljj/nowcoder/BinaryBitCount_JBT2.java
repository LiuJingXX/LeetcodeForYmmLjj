package Ljj.nowcoder;

/**
 * @ClassName BinaryBitCount_JBT2
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/1/17 22:53
 * @Version 1.0
 **/
public class BinaryBitCount_JBT2 {
    private static int bitCount(int a,int b){
        int res = 0;
        while(a > 0 || b > 0){
            if((a & 1) != (b & 1)){
                res++;
            }
            a = a>>1;
            b = b>>1;
        }
        return res;
    }
    private static int bitCount2(int a,int b){
        int num = a^b;
        int res = 0;
        while(num != 0){
            res++;
            num = (num - 1)&num;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(bitCount(22,33));
        System.out.println(bitCount2(22,33));
    }
}
