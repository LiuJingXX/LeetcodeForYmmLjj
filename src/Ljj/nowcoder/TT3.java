package Ljj.nowcoder;

import java.util.*;

/**
 * @ClassName TT3
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/3/16 10:33
 * @Version 1.0
 **/
public class TT3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        while (q-->0) {//注意while处理多个case
            int n = in.nextInt();
            Map<Integer,Integer> map = new TreeMap<>();
            for(int i = 0;i < n;i++){
                int t = in.nextInt();
                map.put(t,map.getOrDefault(t,0) + 1);
            }
            int s = map.size();
            int[] a = new int[s];
            int ss = 0;
            for(int m:map.keySet()){
                a[ss++] = m;
            }
            Arrays.sort(a);
            int count = 0;
            for(int i = s-1;i >= s/2;i--){
                count += map.get(a[i]);
            }
            count += n;
            System.out.println(count);
        }
    }
}
