package Ljj.nowcoder;

import java.util.Stack;

/**
 * @ClassName ParenthesisMatching_JD4
 * @Description 判断括号匹配是否能通过一次（必须执行）调整匹配。
 * @Author LiuJJ
 * @Date 2019/1/7 19:42
 * @Version 1.0
 **/
public class ParenthesisMatching_JD4 {
    private static boolean matching(String str){
        if(str == null || str.length() < 1){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        int tag = 1;
        char[] s = str.toCharArray();
        if(s.length == 2 && s[0] == '(' && s[1] == ')'){
            return false;
        }
        int t1 = 0,t2 = 0;
        for(int i = 0;i < s.length;i++){
            if(s[i] == '('){
                stack.push('(');

            }else if(stack.empty() && s[i] == ')'){
                if(tag == 1){
                    tag = 0;
                }else{
                    return false;
                }

            }else if(s[i] == ')'){
                stack.pop();
            }
        }
        if(stack.empty() && tag == 1||(stack.size() == 1 && stack.peek() == '(')){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "())(";
        String s2 = ")))(((";
        String s3 = ")()()()(()";
        String s4 = "()";
        System.out.println(matching(s1));
        System.out.println(matching(s2));
        System.out.println(matching(s3));
        System.out.println(matching(s4));
    }
}
