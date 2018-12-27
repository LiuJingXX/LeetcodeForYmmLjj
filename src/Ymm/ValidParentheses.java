package Ymm;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static boolean toCharArray(String s) {
        if(s.length()==0) return true;
        //System.out.println(s.substring(0,1));
        if(s.substring(0,1).equals(")") || s.substring(0,1).equals("]") ||s.substring(0,1).equals("}")) return false;
        char[] schar=s.toCharArray();
        //System.out.println(schar);
        Map<Character,Character> dict= new HashMap<>();
        dict.put(')','(');
        dict.put(']','[');
        dict.put('}','{');
        char[] reg=new char[schar.length];
        //System.out.println(schar[0]=='{');
        int count=0;
        for(int i=0;i<schar.length;i++){
            if(schar[i]=='('||schar[i]=='['||schar[i]=='{'){
                reg[count]=schar[i];
                count+=1;
            }
            else{
                if(reg[0]==' ' && (schar[i]==')'||schar[i]==']'||schar[i]=='}')) return false;
                if(reg[count-1]==dict.get(schar[i])){
                    reg[count-1]=' ';
                    count-=1;
                }
                else return false;
                }
            }
        if(reg[0]==' ') return true;
        else return false;
        //return true;

    }

    public static boolean stack(String s){
        Stack<Character> st=new Stack<>();
        char[] schar=s.toCharArray();
        for(int i=0;i<schar.length;i++){
            if(schar[i]=='('||schar[i]=='['||schar[i]=='{') st.push(schar[i]);
            else {
                if (st.empty() && (schar[i] == ')' || schar[i] == ']' || schar[i] == '}')) return false;
                if (schar[i] == ')' && st.peek() == '(') st.pop();
                else if (schar[i] == ']' && st.peek() == '[') st.pop();
                else if (schar[i] == '}' && st.peek() == '{') st.pop();
                else return false;
            }
        }
        if(st.empty()) return true;
        else return false;
    }

    public static void main(String[] args) {
        String s="[]{}";
        System.out.println(stack(s));
    }
}
