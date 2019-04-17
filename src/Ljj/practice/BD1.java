package Ljj.practice;

import java.util.*;

/**
 * @ClassName BD1
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/4/8 18:22
 * @Version 1.0
 **/
public class BD1 {
    public static void main(String[] args) {
        List<List<Integer>> l =new ArrayList<>();
        List<Integer> e1 = Arrays.asList(8,2,3,2);
        List<Integer> e2 = Arrays.asList(2,3,4,8);
        List<Integer> e3 = Arrays.asList(8,3,11,12);
        List<Integer> e4 = Arrays.asList(2,3,6,8);
        l.add(e1);
        l.add(e2);
        l.add(e3);
        l.add(e4);
        System.out.println(find(4,4,l));
    }
    public static List<Integer> find(int numCustomer,int numProduct,List<List<Integer>> productList){
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < numCustomer;i++){
            set.clear();
            set.addAll(productList.get(i));
            /*for(int j = 0;j < numProduct;j++){
                int tmp = productList.get(i).get(j);
                set.add(tmp);
            }*/
            for(Integer t:set){
                map.put(t,map.getOrDefault(t,0) + 1);
            }
        }
        for(Map.Entry<Integer,Integer> entrys:map.entrySet()){
            int v = entrys.getValue();
            if(v == numCustomer){
                list.add(entrys.getKey());
            }
        }
        return list;
    }
}
