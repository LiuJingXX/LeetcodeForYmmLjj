package Ljj.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName HW4
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/4/10 18:42
 * @Version 1.0
 **/
public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> stack = new Stack<>();
        List<Character> list = new LinkedList<>();
        List<Character> res = new LinkedList<>();
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                continue;
            }else if(c != '}' && c != ']' && c != ')'){
                stack.push(c);
                continue;
            }else if(c != '}' || c != ']' || c != ')'){
                while(!stack.isEmpty()){
                    char a = stack.peek();
                    if(!(a >= '0' && a <= '9')){
                        list.add(a);
                        stack.pop();
                    }else{
                        for(int k = 0;k < a - '0';k++){
                            res.addAll(list);
                        }
                        stack.pop();
                        break;
                    }
                }
            }
        }
        while (!stack.isEmpty()){
            res.add(stack.peek());
            stack.pop();
        }
        char[] arr = new char[res.size()];
        for(int i = 0;i < res.size();i++){
            arr[i] = res.get(i);
        }
        System.out.println(String.valueOf(arr));
    }
}
