package Ljj.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName PDD2
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/4/3 18:19
 * @Version 1.0
 **/
public class PDD2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[10];
        for(int i = 0;i < 10;i++){
            n[i] = in.nextInt();
        }
        int a = in.nextInt();
        int b = in.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < 10;i++){
            map.put(i,n[i]);
        }
        String s1 = "",s2 = "";
        int count = 0;
        for(int i = 0;i < 10;i++){
            while(map.get(i) != 0){
                int v = map.get(i);
                count++;
                if(count <= a){
                    s1 += new String(i + "");
                }else if(count <= a + b){
                    s2 += new String(i + "");
                }
                map.put(i,v - 1);
            }
        }
        System.out.println(Integer.parseInt(s1) * Integer.parseInt(s2));
    }
}
