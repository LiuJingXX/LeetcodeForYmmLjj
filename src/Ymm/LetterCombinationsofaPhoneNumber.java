package Ymm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LetterCombinationsofaPhoneNumber
 * @Description TODO
 * @Author manyu
 * @Date 2018/12/31 16:04
 * @Version 1.0
 **/
public class LetterCombinationsofaPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        if(digits.length()==0||digits==null) return list;
        String[] dict={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        addletters(0,digits,"",dict,list);
        return list;
    }

    public static void addletters(int index,String digits,String s,String[] dict,List<String> list) {   //index:遍历字符串digits；digits:目标；s:添加可能组合的临时字符串；
        if (index == digits.length()) {
            if (s.length() != 0) {
                list.add(s);
                return;
            }
        }
        int tmp = digits.charAt(index) - '0';
        for (int i = 0; i < dict[tmp].length(); i++) {
            String str = s + dict[tmp].charAt(i);
            addletters(index + 1, digits, str, dict, list);
        }
    }

    public static void main(String[] args) {
            String digits="23";
            System.out.println(letterCombinations(digits));
        }
}
