package Ljj.nowcoder;

import java.util.Scanner;

/**
 * @ClassName ReSortArray_WY3
 * @Description 一个数组能否排序后满足Ai * Ai+1 是4的倍数。
 * @Author LiuJJ
 * @Date 2019/1/13 23:19
 * @Version 1.0
 **/
public class ReSortArray_WY3 {
    private static String reSort(int[] m){
        int a = 0,b = 0,c = 0;
        for(int i : m){
            if(i%2 != 0){
                a++;
            }else if(i/2%2 == 0){
                c++;
            }else{
                b++;
            }
        }
        if(a - 1 < c){
            return "Yes";
        }
        if(a - 1 == c && b == 0){
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int m = sc.nextInt();
            int[] mm = new int[m];
            for(int i = 0;i < m;i++){
                mm[i] = sc.nextInt();
            }
            System.out.println(reSort(mm));
        }
    }
}
