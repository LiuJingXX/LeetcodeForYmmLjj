package Ljj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName L423_OriginalDigits
 * @Description 给定一个非空字符串，其中包含字母顺序打乱的英文单词表示的数字0-9。按升序输出原始的数字。
 * 输入: "owoztneoer"
 *
 * 输出: "012" (zeroonetwo)
 * @Author LiuJJ
 * @Date 2019/1/16 13:46
 * @Version 1.0
 **/
public class L423_OriginalDigits {
    private static String originalDigits(String s){
        int[] a = new int[26];
        for(int i = 0;i < s.length();i++){
            a[s.charAt(i) - 'a']++;
        }
        List<Integer> list = new ArrayList<>();
        //z 0
        if(a[25] != 0){
            for(int i = 0;i < a[25];i++){
                list.add(0);
            }
            a[4] -= a[25];
            a[17] -= a[25];
            a[14] -= a[25];
        }
        //x 6
        if(a[23] != 0){
            for(int i = 0;i < a[23];i++){
                list.add(6);
            }
            a[18] -= a[23];
            a[8] -= a[23];
        }
        //w 2
        if(a[22] != 0){
            for(int i = 0;i < a[22];i++){
                list.add(2);
            }
            a[19] -= a[22];
            a[14] -= a[22];
        }
        //u 4
        if(a[20] != 0){
            for(int i = 0;i < a[20];i++){
                list.add(4);
            }
            a[5] -= a[20];
            a[14] -= a[20];
            a[17] -= a[20];
        }
        //g 8
        if(a[6] != 0){
            for(int i = 0;i < a[6];i++){
                list.add(8);
            }
            a[4] -= a[6];
            a[8] -= a[6];
            a[7] -= a[6];
            a[19] -= a[6];
        }
        //o 1
        if(a[14] != 0){
            for(int i = 0;i < a[14];i++){
                list.add(1);
            }
            a[13] -= a[14];
            a[4] -= a[14];
        }
        //t 3
        if(a[19] != 0){
            for(int i = 0;i < a[19];i++){
                list.add(3);
            }
            a[7] -= a[19];
            a[17] -= a[19];
            a[4] -= 2*a[19];
        }
        //f 5
        if(a[5] != 0){
            for(int i = 0;i < a[5];i++){
                list.add(5);
            }
            a[8] -= a[5];
            a[21] -= a[5];
            a[4] -= a[5];
        }
        //s 7
        if(a[18] != 0){
            for(int i = 0;i < a[18];i++){
                list.add(7);
            }
        }
        //i 9
        if(a[8] != 0){
            for(int i = 0;i < a[8];i++){
                list.add(9);
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(Integer i: list){
            sb.append(i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "owoztneoer";
        String s2 = "fviefuro";
        System.out.println(originalDigits(s1));
        System.out.println(originalDigits(s2));
    }
}
