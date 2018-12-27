package Ymm;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        String s = x + "";
        String s_reverse = new StringBuilder(s).reverse().toString();
        //System.out.println(s_reverse.equals(s));
        return s.equals(s_reverse);

    }

    public static void main(String[] args) {
        int x=121;
        System.out.println(isPalindrome(x));
    }
}
