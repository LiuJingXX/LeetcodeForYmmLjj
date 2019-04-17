package Ljj.nowcoder;

/**
 * @ClassName FindNumberInQueue_ZH4
 * @Description 输入n和0- - n中n个数，求哪个数没出现。
 * @Author LiuJJ
 * @Date 2019/1/15 21:07
 * @Version 1.0
 **/
public class FindNumberInQueue_ZH4 {
    private static int find(int n,int[] a){
        int[] b = new int[n + 1];
        for(int i = 0;i < n;i++){
            b[a[i]] = 1;
        }
        for(int i = 0;i <= n;i++){
            if(b[i] != 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a1 = {3,3,0,1};
        int[] a2 = {2,3,4,5,6,7,0};
        System.out.println(find(4,a1));
        System.out.println(find(7,a2));
    }
}
