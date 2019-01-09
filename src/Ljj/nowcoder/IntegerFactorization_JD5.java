package Ljj.nowcoder;

/**
 * @ClassName IntegerFactorization_JD5
 * @Description 判断N是否可分解为x*y，且x为奇数，y为偶数.2 < n < 2^63.
 * 如果有多解，输出y最小的
 * @Author LiuJJ
 * @Date 2019/1/7 20:10
 * @Version 1.0
 **/
public class IntegerFactorization_JD5 {
    private static String result(long n){
        String no = "NO";
        if(n % 2 == 1){
            return no;
        }
        for(long y = 2;y <= n;y++,y++){
            if(n % y == 0 && ((n/y) %2 == 1)){
                return n/y + " " + y;
            }
        }
        return no;
    }

    public static void main(String[] args) {
        long a1 = 10;
        long a2 = 5;
        long a3 = 1235432534;
        System.out.println(result(a1));
        System.out.println(result(a2));
        System.out.println(result(a3));

    }
}
