package Ymm;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
    public static int romanToInt(String s) {
        Map<Character,Integer> dict=new HashMap<>();
        dict.put('I',1);
        dict.put('V',5);
        dict.put('X',10);
        dict.put('L',50);
        dict.put('C',100);
        dict.put('D',500);
        dict.put('M',1000);
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            //System.out.println(s.charAt(i));
            if(dict.get(s.charAt(i))<dict.get((s.charAt(i+1)))) sum-=dict.get(s.charAt(i));
            else sum+=dict.get(s.charAt(i));
        }
        sum+=dict.get(s.charAt(s.length()-1));
        return sum;
    }

    public static void main(String[] args) {
        String s="IX";
        System.out.println(romanToInt(s));
    }
}
