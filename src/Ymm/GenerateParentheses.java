package Ymm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GenerateParentheses
 * @Description 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 * @Author manyu
 * @Date 2019/1/1 22:46
 * @Version 1.0
 **/
public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        generate(n,n,list,"");
        return list;
    }

    public static void generate(int left,int right,List<String>list,String res){
        if(left<0||right<0||left>right) return;
        if(left==0&&right==0){
            list.add(res);
            return;
        }
        generate(left-1,right,list,res+'(');
        generate(left,right-1,list,res+')');
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(1));
    }
}
