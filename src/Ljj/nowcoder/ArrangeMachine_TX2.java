package Ljj.nowcoder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @ClassName ArrangeMachine_TX2
 * @Description 链接：https://www.nowcoder.com/questionTerminal/42e7ff5c5696445ab907caff17fc9e15?orderByHotValue=1&page=1&onlyReference=false
 * 小Q的公司最近接到m个任务, 第i个任务需要xi的时间去完成, 难度等级为yi。
 * 小Q拥有n台机器, 每台机器最长工作时间zi, 机器等级wi。
 * 对于一个任务,它只能交由一台机器来完成, 如果安排给它的机器的最长工作时间小于任务需要的时间, 则不能完成,如果完成这个任务将获得200 * xi + 3 * yi收益。
 * 对于一台机器,它一天只能完成一个任务, 如果它的机器等级小于安排给它的任务难度等级, 则不能完成。
 * 小Q想在今天尽可能的去完成任务, 即完成的任务数量最大。如果有多种安排方案,小Q还想找到收益最大的那个方案。小Q需要你来帮助他计算一下。
 * @Author LiuJJ
 * @Date 2019/1/9 15:48
 * @Version 1.0
 **/
public class ArrangeMachine_TX2 {
    static class Pair{
        int time;
        int diff;
        public Pair(int time,int diff){
            this.time = time;
            this.diff = diff;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Pair[] machines = new Pair[n];
        Pair[] tasks = new Pair[m];
        for(int i = 0;i < n;i++){
            machines[i] = new Pair(scanner.nextInt(),scanner.nextInt());
        }
        for(int i = 0;i < m;i++){
            tasks[i] = new Pair(scanner.nextInt(),scanner.nextInt());
        }
        Comparator<Pair> cmp = new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.time == o2.time){
                    return o2.diff - o1.diff;
                }else{
                    return o2.time - o1.time;
                }
            }
        };
        Arrays.sort(machines,cmp);
        Arrays.sort(tasks,cmp);
        long sum = 0;
        int count = 0;
        int j = 0;
        int[] dp = new int[101];
        for (int i = 0; i < m; i++) {
            while (j < n && machines[j].time >= tasks[i].time) {
                dp[machines[j].diff]++;
                j++;
            }
            for (int k = tasks[i].diff; k < 101; k++) {
                if (dp[k] != 0) {
                    dp[k]--;
                    sum += 200 * tasks[i].time + 3 * tasks[i].diff;
                    count++;
                    break;
                }
            }
        }
        System.out.println(count + " " + sum);
        scanner.close();
    }
}
