package Ljj.practice;

import java.util.Scanner;

/**
 * @ClassName HW2
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/4/10 18:41
 * @Version 1.0
 **/
public class HW2 {
    private static int j = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        while(j < s.length()){
            char c = s.charAt(j);
            if(Character.isAlphabetic(c)){
                sb.append(c);
                j++;
            }else{
                sb.append(process(s));
            }
        }
        System.out.println(sb.reverse().toString());
    }
    private static StringBuilder process(String s){
        int n = s.charAt(j) - '0';
        j += 2;
        StringBuilder sb1 = new StringBuilder();
        while(j < s.length()){
            char c = s.charAt(j);
            if(Character.isAlphabetic(c)){
                sb1.append(c);
                j++;
            }else if(Character.isDigit(c)){
                sb1.append(process(s));
            }else{
                j += 1;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < n;i++){
            sb.append(sb1);
        }
        return sb;
    }
}
