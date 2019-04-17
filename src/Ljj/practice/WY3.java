package Ljj.practice;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

/**
 * @ClassName WY3
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/4/6 18:54
 * @Version 1.0
 **/
public class WY3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int b = sc.nextInt();
            int e = sc.nextInt();
            int[] arr = new int[n+1];
            for(int i = 1;i <= n;i++){
                arr[i] = sc.nextInt();
            }
            Map<Integer, ArrayList<Integer>> map = new HashMap<>();
            for(int i = 0;i < m;i++){
                int k = sc.nextInt();
                int v = sc.nextInt();
                if(map.containsKey(k)){
                    map.get(k).add(v);
                }else{
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(v);
                    map.put(k,list);
                }
            }
            Map<Integer,Double> map1 = new HashMap<>();
            double time1 = arr[b]/(double)e;
            BigDecimal w = new BigDecimal(time1);
            double time = w.setScale(4,BigDecimal.ROUND_HALF_UP).doubleValue();
            map1.put(b,time);
            process(map,map1,(double)e,time,b,arr);
            DecimalFormat df = new DecimalFormat("#.0000");
            for(int i = 1;i < n;i++){
                if(map1.containsKey(i)){
                    System.out.print(df.format(map1.get(i)) + " ");
                }else{
                    System.out.print(df.format(-1) + " ");
                }
            }
            if(map1.containsKey(n)){
                System.out.println(df.format(map1.get(n)));
            }else{
                System.out.println(df.format(-1));
            }
        }
    }
    private static void process(Map<Integer, ArrayList<Integer>> map,Map<Integer,Double> map1,double w,double remain,int k,int[] arr){
        if(!map.containsKey(k)){
            return ;
        }
        ArrayList<Integer> list = map.get(k);
        for(int i = 0;i < list.size();i++){
            double w1 = w/list.size();
            double tt = arr[list.get(i)]/w1;
            BigDecimal big = new BigDecimal(tt);
            double time = big.setScale(4,BigDecimal.ROUND_HALF_UP).doubleValue();
            map1.put(list.get(i),time + remain);
            process(map,map1,w1,remain + time,list.get(i),arr);
        }
    }
}
