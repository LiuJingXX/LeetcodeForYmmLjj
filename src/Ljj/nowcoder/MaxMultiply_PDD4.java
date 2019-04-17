package Ljj.nowcoder;

/**
 * @ClassName MaxMultiply_PDD4
 * @Description 求数组中乘积最大的三个数的乘积。
 * @Author LiuJJ
 * @Date 2019/1/17 18:27
 * @Version 1.0
 **/
public class MaxMultiply_PDD4 {
    private static int getMax(int[] a){
        int m1 = 0,m2 = 0,m3 = 0;
        int d1 = 0,d2 = 0;
        for(int i = 0;i < a.length;i++){
            if(a[i] > 0){
                if(a[i] >= m1){
                    m3 = m2;
                    m2 = m1;
                    m1 = a[i];
                }else if(a[i] >= m2){
                    m3 = m2;
                    m2 = a[i];
                }else if(a[i] > m3){
                    m3 = a[i];
                }
            }else if(a[i] < 0){
                if(a[i] <= d1){
                    d2 = d1;
                    d1 = a[i];
                }else if( a[i] < d2){
                    d2 = a[i];
                }
            }
        }
        if(m3 != 0 || d2 != 0){
            return m1*Math.max(m2*m3,d1*d2);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {3,4,1,2};
        int[] b = {-5,-6,-6,0,1,5,6,5};
        System.out.println(getMax(a));
        System.out.println(getMax(b));
    }
}
