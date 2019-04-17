package Ljj;

import java.util.Stack;

/**
 * @ClassName L224_Calculate
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/2/23 15:42
 * @Version 1.0
 **/
public class L224_Calculate {
    private static int calculate(String s){
        Stack<Integer> stack = new Stack();
        int res = 0;
        int operator = 1;
        int num = 0;
        if(s ==null || s.length() == 0){
            return res;
        }
        for(int i=0,size=s.length(); i < size; i++){
            char singleChar = s.charAt(i);
            if(singleChar == '+'){
                res = res + num * operator;
                num = 0;
                operator = 1;
            } else if(singleChar == '-'){
                res = res + num * operator;
                num = 0;
                operator = -1;
            } else if(singleChar == '('){
                stack.push(res);
                stack.push(operator);
                res = 0;
                operator = 1;
                num = 0;
            } else if(singleChar == ')'){
                res = res + num * operator;
                num = 0;
                res = res * stack.pop();
                res = stack.pop() + res;
            } else if(singleChar != ' '){
                num = num*10 + singleChar - '0';
            }
        }
        res = res + num * operator;
        return res;
    }

    public static void main(String[] args) {
        String s1 = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s1));
    }
}
