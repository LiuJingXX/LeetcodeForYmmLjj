package Ljj;

import java.math.BigInteger;
import java.util.*;

/**
 * @ClassName L942_DiStringMatch
 * @Description 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
 * 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
 * 如果 S[i] == "I"，那么 A[i] < A[i+1]
 * 如果 S[i] == "D"，那么 A[i] > A[i+1]
 * @Author LiuJJ
 * @Date 2019/1/5 0:19
 * @Version 1.0
 **/
public class L942_DiStringMatch {
    public static int[] diStringMatch(String S) {
        int len = S.length();
        int[] array = new int[len + 1];
        int a = 0,b = len;
        for(int i = 0;i < len;i++){
            if(S.charAt(i) == 'I'){
                array[i] = a++;
                if(i == len - 1){
                    array[i + 1] = a++;
                }
            }
            if(S.charAt(i) == 'D'){
                array[i] = b--;
                if(i == len - 1){
                    array[i + 1] = b--;
                }
            }

        }
        return array;
    }

    public static void main(String[] args) {
        String s1 = "IDID";
        for(int i : diStringMatch(s1)){
            System.out.print(i + ",");
        }

    }
}
