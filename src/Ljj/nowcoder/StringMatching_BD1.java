package Ljj.nowcoder;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName StringMatching_BD1
 * @Description String A和B，A是01串，B除了01还会有?，？可以确定为0或1.考虑B在A中出现的可能的组合。
 * Case1： A = "00010001",B = "??",B could be 00,01,10.Then return 3.
 * @Author LiuJJ
 * @Date 2019/1/7 20:27
 * @Version 1.0
 **/
public class StringMatching_BD1 {
    private static int getMatching(String str1,String str2){
        Set<String> set = new HashSet<>();
        int ans = 0;
        for(int i = 0;i < str1.length();i++){
            int j = i + str2.length() -1;
            if(j >= str1.length()){
                continue;
            }
            String cur = str1.substring(i,j + 1);
            if(set.contains(cur)){
                continue;
            }
            set.add(cur);
            boolean flag = true;
            for(int k = 0;k < str2.length();k++){
                if(str2.charAt(k) != cur.charAt(k)){
                    if(str2.charAt(k) == '?'){
                        continue;
                    }else{
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "00010001";
        String s2 = "??";
        System.out.println(getMatching(s1,s2));
    }
}
