package Ljj.nowcoder;

import java.util.Arrays;

/**
 * @ClassName CharacterCoverage_BD3
 * @Description 一行字母s，一行字母t，取t中字符覆盖s中某些字符，得到的最大字典序的字符串。
 * @Author LiuJJ
 * @Date 2019/1/8 11:53
 * @Version 1.0
 **/
public class CharacterCoverage_BD3 {
    private static String get(String s,String t){
        StringBuilder sb = new StringBuilder();
        int i = 0,j = t.length() - 1;
        char[] tt = t.toCharArray();
        Arrays.sort(tt);
        while(i < s.length() && j > -1){
            if(s.charAt(i) < tt[j]){
                sb.append(tt[j]);
                j--;
            }else{
                sb.append(s.charAt(i));
            }
            i++;
        }
        if(i < s.length() - 1){
            sb.append(s.substring(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(get("fedcba","ee"));
        System.out.println(get("fert","cccccc"));
    }
}
