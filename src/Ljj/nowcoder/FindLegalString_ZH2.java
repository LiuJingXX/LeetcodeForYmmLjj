package Ljj.nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName FindLegalString_ZH2
 * @Description 字典序输出包含n个（）的合法字符串
 * @Author LiuJJ
 * @Date 2019/1/14 20:35
 * @Version 1.0
 **/
public class FindLegalString_ZH2 {
    private static void getLegal(int n){
        List<String> list = new ArrayList<>();
        dfs(n,n,"",list);
        Collections.sort(list);
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
    private static void dfs(int left,int right,String cur,List<String> list){
        if(left < 0 || right < 0 || left > right){
            return;
        }
        if(left == 0 && right == 0){
            list.add(cur);
            return;
        }
        dfs(left - 1,right,cur + "(",list);
        dfs(left,right - 1,cur + ")",list);
    }
    private static void getLegal2(int n){
        List<String> list = new ArrayList<>();
        String str = "";
        dfs2(n,0,0,0,str,list);
        for(String s:list){
            System.out.println(s);
        }

    }
    private static void dfs2(int n,int x,int l,int r,String str,List<String> list){
        if(2 * n == x){
            list.add(str);
            return;
        }
        if(l < n){
            dfs2(n,x + 1,l + 1,r,str + "(",list);
        }
        if(l > r && n > r){
            dfs2(n,x + 1,l,r + 1,str + ")",list);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getLegal(n);
        System.out.println("---------------------------------------------------");
        getLegal2(n);
    }
}
