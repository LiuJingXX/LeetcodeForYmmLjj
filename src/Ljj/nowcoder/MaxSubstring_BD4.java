package Ljj.nowcoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName MaxSubstring_BD4
 * @Description 如果擦除x中的某些字母可得到y，则y被称为x的子序列。给定x，求字典序最大的子序列y
 * @Author LiuJJ
 * @Date 2019/1/8 14:22
 * @Version 1.0
 **/
public class MaxSubstring_BD4 {
    private static String get(String str){
        StringBuilder sb = new StringBuilder();
        char[] s = str.toCharArray();
        int start = 0;
        char tmp = 'A';
        int index,count;
        while(start < s.length - 1){
            index = start;
            count = 0;
            for(int i = start;i < s.length;i++){
                if(s[i] > tmp){
                    tmp = s[i];
                    index = i;
                    count = 1;
                }else if(s[i] == tmp){
                    index = i;
                    count++;
                }
            }
            while(count > 0){
                sb.append(s[index]);
                count--;
            }
            start = index + 1;
            tmp = 'A';
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(get("test"));
        System.out.println(get("nowcoder"));
    }
}
