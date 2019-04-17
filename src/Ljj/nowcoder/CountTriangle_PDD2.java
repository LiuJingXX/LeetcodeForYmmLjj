package Ljj.nowcoder;

import java.util.Scanner;

/**
 * @ClassName CountTriangle_PDD2
 * @Description 给出平面上n个点，求能组成三角形的个数。
 * @Author LiuJJ
 * @Date 2019/1/17 15:33
 * @Version 1.0
 **/
public class CountTriangle_PDD2 {
    private static int getNum(Point[] m){
        int num = 0;
        for(int i = 0;i < m.length;i++){
            for(int j = i + 1;j < m.length;j++){
                for(int k = j + 1;k < m.length;k++){
                    if((m[k].y - m[j].y)*(m[j].x - m[i].x) - (m[k].x - m[j].x)*(m[j].y - m[i].y) != 0){
                        num++;
                    }
                }
            }
        }
        return num;
    }
    static class Point{
        int x;
        int y;
        Point(int x,int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for(int i = 0;i < n;i++){
            points[i] = new Point(sc.nextInt(),sc.nextInt());
        }
        System.out.println(getNum(points));
    }
}
