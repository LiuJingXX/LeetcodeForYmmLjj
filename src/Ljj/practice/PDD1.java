package Ljj.practice;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName PDD1
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/4/3 18:19
 * @Version 1.0
 **/
public class PDD1 {
    public static void main(String[] args) {
        System.out.printf("%.6f",199.0);
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int b = in.nextInt();
        String[] a = s.substring(1,s.length()-1).split("\\,");
        int num = a.length;
        System.out.println(num);
        int[] n = new int[num];
        n[0] = Integer.parseInt(a[0].trim());
        for(int i = 1;i < num;i++){
            n[i] = Integer.parseInt(a[i].trim());
            //{31, 18, 19, 1, 25}
            //10
        }
        int count = 0;
        Arrays.sort(n);

        for(int i = 0;i < num - 1;i++){
            for(int j = i + 1;j < num;j++){
                if(n[j] - n[i] < b){
                    count++;
                }else{
                    break;
                }
            }
        }
        //System.out.println(2*count/(double)(num*(num-1)));
        double result = 2*count/(double)(num*(num-1));
        DecimalFormat decimalFormat = new DecimalFormat("#0.000000");
        //System.out.printf("%.6f",2*count/(double)(num*(num-1)));
        double dd = Double.valueOf(String.format("%.6f",result));
        System.out.println(dd);
    }
}
