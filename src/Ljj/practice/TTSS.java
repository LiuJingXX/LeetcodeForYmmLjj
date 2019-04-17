package Ljj.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName TTSS
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/3/30 10:57
 * @Version 1.0
 **/
public class TTSS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            if(n < 1||k < 1){
                return;
            }
            int[][] arr = new int[n][k];
            for(int i = 0;i < n;i++){
                for(int j = 0;j < k;j++){
                    arr[i][j] = scanner.nextInt();
                }
            }
            Arrays.sort(arr,(x,y)->(cmp(x) - cmp(y)));
            System.out.print("[");
            for(int i = 0;i < n;i++){
                System.out.print("[");
                for(int j = 0;j < k;j++){
                    System.out.print(arr[i][j]);
                    if(j != k-1){
                        System.out.print(", ");
                    }
                }
                System.out.print("]");
                if(i != n-1){
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
    private static int cmp(int[] a){
        int len = a.length;
        int count = 0;
        for(int i = 0;i < len;i++){
            for(int j = i+1;j < len;j++){
                if(a[i] > a[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
