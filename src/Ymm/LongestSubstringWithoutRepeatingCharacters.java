package Ymm;

import java.util.HashMap;
import java.util.Map;

//3
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        //System.out.println(s.length());
        if(s.length()==0||s==null) return 0;
        if(s.length()==1)return 1;
        char[] sc=s.toCharArray();
        int left=0;
        int right=-1;
        int max=0;
        Map<Character,Integer> dict=new HashMap<>();
        for (int i=0;i<sc.length;i++){
            if(!dict.containsKey(sc[i])){
                dict.put(sc[i],i);
                right++;
            }
            else {
                if(dict.get(sc[i])<left)
                {
                    right++;
                    dict.put(sc[i],i);
                }
                else {
                    if(max<right-left+1) max=right-left+1;
                    left = dict.get(sc[i]) + 1;
                    right = i;
                    dict.put(sc[i], i);
                }
            }
        }
        if(max<right-left+1) max=right-left+1;
        return max;
    }

    public static void main(String[] args) {
        String s="aabaab!bb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
