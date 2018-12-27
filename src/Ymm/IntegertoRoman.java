package Ymm;

import java.util.HashMap;
import java.util.Map;

public class IntegertoRoman {
    public static String intToRoman(int num) {
        int[] n={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] r={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String roman=new String();
        for(int i=0;i<n.length;i++){
            while(num>=n[i]){
                num-=n[i];
                roman+=r[i];
            }
        }
        return roman;
    }

    public static void main(String[] args) {
        int num=1994;
        System.out.println(intToRoman(num));
    }
}
