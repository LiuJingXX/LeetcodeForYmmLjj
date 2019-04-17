package Ljj.nowcoder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName CharacterSort_JBT1
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/1/17 22:10
 * @Version 1.0
 **/
public class CharacterSort_JBT1 {
    private static String sortString(String str){
        char[] c = str.toCharArray();
        String digit = "";
        String alpha = "";
        for(char i:c){
            if(Character.isDigit(i)){
                digit += i;
            }else{
                alpha += i;
            }
        }
        char[] digits = digit.toCharArray();
        char[] alp = alpha.toCharArray();
        Arrays.sort(digits);
        Arrays.sort(alp);
        return String.valueOf(alp) + String.valueOf(digits);
    }

    public static void main(String[] args) {
        String s1 = "jkqwr2432rj23r5842539t8234fewfwt3t2";
        System.out.println(sortString(s1));
    }
}
