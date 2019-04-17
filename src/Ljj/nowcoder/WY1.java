package Ljj.nowcoder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @ClassName WY1
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/3/17 21:03
 * @Version 1.0
 **/
public class WY1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            Node[] a = new Node[n];
            int w,h;
            for(int i = 0;i < n;i++){
                w = sc.nextInt();
                h = sc.nextInt();
                a[i] = new Node(w,h);
            }
            Arrays.sort(a, new Comparator<Node>() {
                @Override
                public int compare(Node o1, Node o2) {
                    if(o1.w*o1.h != o2.w*o2.h){
                        return o1.w*o1.h - o2.w*o2.h;
                    }else if(Math.min(o1.w/(double)o1.h,o1.h/(double)o1.w) != Math.min(o2.w/(double)o2.h,o2.h/(double)o2.w)){
                        return Math.min(o2.w/(double)o2.h,o2.h/(double)o2.w)-Math.min(o1.w/(double)o1.h,o1.h/(double)o1.w)>0?1:-1;
                    }else{
                        return o1.w - o2.w;
                    }
                }
            });
            for(int i = 0;i < n;i++){
                a[i].print();
            }
        }
    }
    public static class Node{
        int w,h;
        public Node(int w,int h){
            this.h = h;
            this.w = w;
        }
        public void print(){
            System.out.println(w);
            System.out.println(h);
        }
    }
}
