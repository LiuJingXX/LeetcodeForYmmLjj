package Ljj.test;

import java.util.*;

/**
 * @ClassName test2
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/4/12 0:06
 * @Version 1.0
 **/
public class test2 {
    public static void main(String[] args) {
        System.out.println(frequencySort("Aabbsss"));
/*
        System.out.println(chang(1,2));
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        Iterator<Integer> it = set.iterator();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Set<ArrayList<Integer>> set1 = new HashSet<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(1);
            System.out.println(set1.add(list));
            System.out.println(set1.add(list2));
            System.out.println(set1.add(list3));
        System.out.println();
        Map<Character,Character> map = new HashMap<>();
*/

    }
    public static String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        char[] c = s.toCharArray();
        for(int i = 0;i < c.length;i++){
            map.put(c[i],map.getOrDefault(c[i],0) + 1);
        }

        return String.valueOf(c);
    }
    private static int[] chang(int i,int j){
        return new int[]{i,j};
    }
}