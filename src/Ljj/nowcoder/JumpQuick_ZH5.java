package Ljj.nowcoder;

/**
 * @ClassName JumpQuick_ZH5
 * @Description  小招喵喜欢在数轴上跑来跑去，假设它现在站在点n处，它只会3种走法，分别是：
 * 1.数轴上向前走一步，即n=n+1
 * 2.数轴上向后走一步,即n=n-1
 * 3.数轴上使劲跳跃到当前点的两倍，即n=2*n
 * 现在小招喵在原点，即n=0，它想去点x处，快帮小招喵算算最快的走法需要多少步？
 * @Author LiuJJ
 * @Date 2019/1/15 21:28
 * @Version 1.0
 **/
public class JumpQuick_ZH5 {
    private static int arrive(int n){
        int result = 0;
        while(n >= 4 || n <= -4){
            if(n % 2 == 0){
                result++;
                n /= 2;
            }else{
                if((n + 1) % 4 == 0){
                    n = (n + 1)/4;
                }else {
                    n = (n - 1)/4;

                }
                result += 3;
            }
        }
        if(n < 4 && n > -4){
            return Math.abs(n) + result;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(arrive(5));
        System.out.println(arrive(31));
        System.out.println(arrive(29));
        System.out.println(arrive(-11));

    }
}
