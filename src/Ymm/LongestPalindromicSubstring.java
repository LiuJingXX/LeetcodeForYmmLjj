package Ymm;

/*Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
*/
 public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if(s.length()==1) return s;
        if(s==null || s.length()==0)return  "";
        int end=0,start=0,len;
        int longest=0;
        for(int i=0;i<s.length();i++){
            int len1=expand(s,i,i);
            int len2=expand(s,i,i+1);
            len=Math.max(len1,len2);
            if(len>longest){
                longest=len;
                end=len/2+i;
                start=end-len+1;
            }
        }
        return s.substring(start,end+1);
    }

    public static int expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            right++;
            left--;
        }
        return right-left-1;
    }

    public static void main(String[] args) {
        String s="cbbc";
        System.out.println(longestPalindrome(s));
    }
}
