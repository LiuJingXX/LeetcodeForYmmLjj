package Ljj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName PastError
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/3/30 21:23
 * @Version 1.0
 **/
public class PastError extends Super{
    int x = 200;
    public PastError(String s){

    }
    public PastError(){
        System.out.println("Sub");
    }
    public static void main(String[] args) {
        String[] arr = {"as","asd","dsf","dqw"};
        //List<String> list = Arrays.asList(arr);
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
        list.add("qqwe");
        for(String s:list){
            System.out.println(s);
        }
        //循环内部删除List元素
        for(int i = 0;i < list.size();i++){
            //list.remove(i);
        }
        System.out.println(list);
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            String s = iter.next();
            if(s.equals("asd")){
                iter.remove();
            }
        }
        System.out.println(list);
    }
}
class Super{
    String s;
    public Super(){

    }
    public Super(String s){
        this.s = s;
    }
}