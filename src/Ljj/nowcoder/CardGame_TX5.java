package Ljj.nowcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName CardGame_TX5
 * @Description 一打卡片，A和B轮流选，求A的总和减去B的总和最大是多少
 * @Author LiuJJ
 * @Date 2019/1/10 16:07
 * @Version 1.0
 **/
public class CardGame_TX5 {
    private static int get(int[] nums){
        Arrays.sort(nums);
        int tag = nums.length%2;
        int res = 0;
        for(int i = 0;i < nums.length;i++){
            if(i%2 == tag){
                res -= nums[i];
            }else{
                res += nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] a = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = scanner.nextInt();
            }
            System.out.println(get(a));
        }
    }
}
