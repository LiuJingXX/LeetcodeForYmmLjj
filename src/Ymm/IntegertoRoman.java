package Ymm;

import java.util.HashMap;
import java.util.Map;

public class IntegertoRoman {
    public static String intToRoman(int num) {
        Map<Integer,String> dict= new HashMap<>();
        dict.put(1,"I");
        dict.put(5,"V");
        dict.put(10,"X");
        dict.put(50,"L");
        dict.put(100,"C");
        dict.put(500,"D");
        dict.put(1000,"M");
        StringBuilder roman=new StringBuilder();
        int r,q,n=10;
        if(dict.containsKey(num)) return dict.get(num);
        else if(n<10){

        }
    }
}
