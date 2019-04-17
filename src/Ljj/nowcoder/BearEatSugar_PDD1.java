package Ljj.nowcoder;

import java.util.*;

/**
 * @ClassName BearEatSugar_PDD1
 * @Description 有n只小熊，他们有着不同的战斗力。每次他们吃糖时，会按照战斗力来排。战斗力高的小熊拥有优先选择权。前边的小熊吃饱了，后边的小熊才能吃。
 * 每只小熊有一个饥饿值，每次进食时，小熊会选择最大的能填饱自己当前饥饿值的那颗糖来吃，可能吃完没饱会重复上述过程，但不会选择吃撑。
 * 给出n只小熊的战斗力和饥饿值，和m颗糖。
 * 求进食完，每只小熊剩余的饥饿值。
 * @Author LiuJJ
 * @Date 2019/1/17 14:20
 * @Version 1.0
 **/
public class BearEatSugar_PDD1 {
    private static int[] eat(List<Integer> a, int[][] b){
        int[] result = new int[b.length];
        int[] order = new int[100];
        for(int i = 0;i < b.length;i++){
            order[i] = b[i][0];
        }
        Arrays.sort(b,(x,y)->(x[0] - y[0]));
        Collections.sort(a,Collections.reverseOrder());
        int i = 0;
        while(i < b.length && a.size() > 0){
            int j = 0;
            while(j < a.size())
            if(a.get(j) <= b[i][1]){
                b[i][1] -= a.remove(j);
            }else{
                j++;
            }
            i++;
        }
        for(int k = 0;k < b.length;k++){
            for(int l = 0;l < b.length;l++){
                if(order[k] == b[l][0]){
                    result[k] = b[l][1];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < m;i++){
            list.add(sc.nextInt());
        }
        int[][] s = new int[n][2];
        for(int i = 0;i < n;i++){
            s[i][0] = sc.nextInt();
            s[i][1] = sc.nextInt();
        }
        int[] res = eat(list,s);
        for(int i = 0;i < res.length;i++){
            System.out.print(res[i] + ",");
        }
        System.out.println();
    }
}
