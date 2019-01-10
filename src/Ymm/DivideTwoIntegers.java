package Ymm;
/**
 * @ClassName DivideTwoIntegers
 * @Description 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 *              返回被除数 dividend 除以除数 divisor 得到的商。
 *              输入: dividend = 10, divisor = 3
 *              输出: 3
 * @Author manyu
 * @Date 2019/1/3 20:30
 * @Version 1.0
 **/


public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        if (dividend == 0 || divisor == 0) {
            return 0;
        }
        boolean isNeg = (dividend > 0 && divisor < 0)
                || (dividend < 0 && divisor > 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        if (b > a) {
            return 0;
        }
        long sum = 0;
        long pow = 0;
        long result = 0;
        while (a >= b) {
            pow = 1;
            sum = b;
            while (sum + sum <= a) {
                sum += sum;
                pow += pow;
            }
            a -= sum;
            result += pow;
        }

        result = ((((dividend ^ divisor) >> 31) & 1) == 1) ? -result: result;

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }

        return (int)result;
    }

    public static void main(String[] args) {
        int dividend=Integer.MIN_VALUE;
        int divisor=-1;
        long a=Math.abs((long) dividend);
        System.out.println(a);
        System.out.println(Math.abs(dividend));
        //long start = System.currentTimeMillis();
        //System.out.println(divide(dividend,divisor));
        //System.out.println(System.currentTimeMillis() - start);
    }
}
