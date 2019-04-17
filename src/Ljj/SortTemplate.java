package Ljj;

import java.util.*;

/**
 * @ClassName SortTemplate
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/1/13 21:51
 * @Version 1.0
 **/
public class SortTemplate {
    private static int cmp(Object a,Object b){
        return (int)a - (int)b;
    }
    static class shu{
        int x;
        shu(int x){
            this.x = x;
        }
    }
    static class Cmp1 implements Comparator<shu>{
        @Override
        public int compare(shu o1, shu o2) {
            if(o1.x < o2.x){
                return 1;
            }else if(o1.x == o2.x){
                return 0;
            }else{
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,3,45,6,23,5,67,123,5,6,5,321,99};
        //Collections排序
        List<Integer> list = Arrays.asList(1, 3, 45, 6, 23, 5, 67, 123, 5, 6, 5, 321, 99);
        List<shu> list2 = new ArrayList<>();
        list2.add(new shu(1));
        list2.add(new shu(3));
        list2.add(new shu(2));
        Collections.sort(list2,(a1,a2)->(a1.x-a2.x));
        for(shu x:list2){
            System.out.println(x.x);
        }
        System.out.println("---------------------------------------------------");
        //Collections.sort(intervals,(x,y)->(x.start - y.start));
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for(Integer s:list){
            System.out.print(s + ",");
        }
        System.out.println();
        //结构体排序
        shu[] aa = new shu[a.length];
        for(int i = 0;i < a.length;i++){
            aa[i] = new shu(i);
            aa[i].x = a[i];
        }
        Arrays.sort(aa,new Cmp1());
        for(shu s:aa){
            System.out.print(s.x + ",");
        }
    }
}
