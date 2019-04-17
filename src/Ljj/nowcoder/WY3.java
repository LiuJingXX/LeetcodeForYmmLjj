package Ljj.nowcoder;

import java.util.Scanner;

/**
 * @ClassName WY3
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/3/17 22:07
 * @Version 1.0
 **/
public class WY3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int w = sc.nextInt();
            int h = sc.nextInt();
            int n = sc.nextInt();
            int s = sc.nextInt();
            int t = sc.nextInt();
            int ro = sc.nextInt();
            Person[] a = new Person[n];
            for(int i = 0;i < n;i++){
                a[i] = new Person(sc.nextInt(),sc.nextInt());
            }

        }
    }
    private static int getR(int t){
        return (t*21401+25301)%98765;
    }
    private static class Person{
        private int x,y;
        Person(int x,int y){
            this.x = x;
            this.y = y;
        }
        private void move(int i){
            i = i%4;
            if(i == 0){
                x -= 1;
            }else if(i == 1){
                y += 1;
            }else if(i == 2){
                x += 1;
            }else if(i == 3){
                y -= 1;
            }
        }
    }
}
