package Ljj.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName HW1
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/4/10 18:41
 * @Version 1.0
 **/
public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        List<String> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            s[i] = sc.next();
            int j = 0,len = s[i].length();
            while(j < len - 8){
                list.add(s[i].substring(j,j+8));
                j += 8;
            }
            if(j  < len){
                String tmp = s[i].substring(j);
                for(int k = 0;8 - len + j > k;k++){
                    tmp += "0";
                }
                list.add(tmp);
            }
        }
        Collections.sort(list,(x,y)->(x.compareTo(y)));
        int l = 0;
        for(;l < list.size() - 1;l++){
            System.out.print(list.get(l) + " ");
        }
        System.out.println(list.get(l));
    }
}
