package Ljj.nowcoder;

/**
 * @ClassName MaxInteger_ZH3
 * @Description 将n分解为整数之和，使其乘积最大化
 * @Author LiuJJ
 * @Date 2019/1/15 19:47
 * @Version 1.0
 **/
public class MaxInteger_ZH3 {
    private static int getMax(int n){
        if(n < 4)
            return n - 1;
        if(n%3 == 0){
            return (int)Math.pow((double)3,n/3);
        }
        if(n%3 == 1){
            return (int)Math.pow((double)3,(n-4)/3)*4;
        }
        if(n%3 == 2){
            return (int)Math.pow((double)3,n/3)*2;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(getMax(2));
        System.out.println(getMax(10));
        System.out.println(getMax(9));
    }
}
