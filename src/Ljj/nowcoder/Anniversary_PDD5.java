package Ljj.nowcoder;

import java.util.*;

/**
 * @ClassName Anniversary_PDD5
 * @Description 难---难搞
 * @Author LiuJJ
 * @Date 2019/1/17 21:42
 * @Version 1.0
 **/
public class Anniversary_PDD5 {
    public static TreeSet<Integer> dfs(int root, List<List<Integer>> sons, int[] d, int limit) {

        if (sons.get(root).size() == 0) {
            TreeSet<Integer> temp = new TreeSet<Integer>();
            temp.add(0);
            return temp;
        }
        List<TreeSet<Integer>> sts = new ArrayList<TreeSet<Integer>>();
        List<Integer> list = sons.get(root);
        for (int i = 0; i < list.size(); i++) {
            sts.add(dfs(list.get(i), sons, d, limit));
        }
        TreeSet<Integer> res = new TreeSet<Integer>();
        res.add(0);
        for (int i = 0; i < sts.size(); i++) {
            TreeSet<Integer> set = sts.get(i);
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                int temp = it.next();
                if (d[sons.get(root).get(i)] + temp <= limit) {
                    res.add(d[sons.get(root).get(i)] + temp);
                }
            }
        }
        for (int i = 0; i + 1 < sts.size(); i++) {
            for (int j = i + 1; j < sts.size(); j++) {
                TreeSet<Integer> set1 = sts.get(i);
                TreeSet<Integer> set2 = sts.get(j);
                for (Integer temp1 : set1) {
                    for (Integer temp2 : set2) {
                        if (d[sons.get(root).get(i)] + d[sons.get(root).get(j)] + temp1 + temp2 <= limit) {
                            res.add(d[sons.get(root).get(i)] + d[sons.get(root).get(j)] + temp1 + temp2);
                        }
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int limit = sc.nextInt();
            int len = sc.nextInt();
            List<List<Integer>> sons = new ArrayList<List<Integer>>();
            for (int i = 0; i < len; i++) {
                sons.add(new ArrayList<Integer>());
            }
            int[] father = new int[len];
            Arrays.fill(father, -1);
            int[] d = new int[len];
            int root = 0;
            for (int i = 0; i < len - 1; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                int value = sc.nextInt();
                d[end] = value;
                sons.get(start).add(end);
                father[end] = start;
            }
            while (root < father.length && father[root] != -1) {
                root++;
            }
            TreeSet<Integer> res = dfs(root, sons, d, limit);
            System.out.println(res.size() == 0 ? 0 : res.last());
        }
        sc.close();
    }
}
