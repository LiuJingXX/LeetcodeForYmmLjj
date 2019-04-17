package Ljj;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @ClassName test
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/2/14 12:18
 * @Version 1.0
 **/
public class test1 {
    static class Stu{
        @Override
        public String toString() {
            return "Stu{}";
        }
    }
    public static String[] uncommonFromSentences(String A, String B) {
        List<String> s = new ArrayList<>();
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        for(String a:A.split(" ")){
            map1.put(a,map1.getOrDefault(a,0)+1);
        }
        for(String a:B.split(" ")){
            map2.put(a,map2.getOrDefault(a,0)+1);
        }
        for(Map.Entry entry:map1.entrySet()){
            if((int)entry.getValue() == 1&&(!map2.containsKey(entry.getKey()))){
                s.add((String)entry.getKey());
            }
        }
        for(Map.Entry entry:map2.entrySet()){
            if((int)entry.getValue() == 1&&(!map1.containsKey(entry.getKey()))){
                s.add((String)entry.getKey());
            }
        }
        String[] strings = new String[s.size()];
        return s.toArray(strings);
    }
    public static int NumberOf1(int n) {
        int count = 0;
        while(n!=0){
            if((n&1) == 1){
                count++;
            }
            n>>=1;
        }
        return count;
    }
    public static class FutureTask1 implements Callable<String>{
        int a;
        public FutureTask1(int a){
            this.a = a;
        }
        @Override
        public String call() throws Exception {
            Thread.sleep(a);
            return Thread.currentThread().getName() + "----- a = " + a;
        }
    }

    public static void main(String[] args) throws Exception {
        FutureTask<String> u = new FutureTask<String>(new FutureTask1(10000));
        FutureTask<String> u2 = new FutureTask<String>(new FutureTask1(6000));
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(u);
        executorService.submit(u2);
        while(true){
            if(u.isDone() && u2.isDone()){
                System.out.println(u.get() + " ------ " + u2.get());
            }
            if(u2.isDone()){
                System.out.println(u2.get());
                u.cancel(false);
            }
        }
        //System.out.println(NumberOf1(-10));
        /*Properties pro = new Properties();
        pro.setProperty("name","ymm");
        pro.setProperty("value","ljj");
        pro.setProperty("cla","Ljj.AplusB");
        pro.store(new FileOutputStream(new File("info.properties")),"This is Message!");
        Properties pp = new Properties();
        pp.load(new FileInputStream(new File("info.properties")));
        Class<?> cla = Class.forName(pp.getProperty("cla"));
        Object obj = cla.newInstance();
        System.out.println(obj);
        System.out.println(obj.getClass());
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        Integer[] a = {1,2,434,5,6};
        List<Integer> l = Arrays.asList(a);
        String s = "akjsfnka";
        s.toUpperCase();
        System.out.println(s);
        Integer[] ss = (Integer[])l.toArray();
        String a = "this apple is sweet";
        String b = "this apple is sour";
        System.out.println(uncommonFromSentences(a,b));
        for(String s:uncommonFromSentences(a,b)){
            System.out.println(s);
        }*/

        //System.out.println((char)(0+'a'));
    }
}
