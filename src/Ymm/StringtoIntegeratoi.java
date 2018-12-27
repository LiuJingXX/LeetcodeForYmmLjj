package Ymm;

public class StringtoIntegeratoi {
    public static int myAtoi(String str) {
        if(str==null||str.length()==0) return 0;
        StringBuilder num=new StringBuilder();
        int flag=0;
        for(int i=0;i<str.length();i++){
            char tmp=str.charAt(i);
            if(flag==0&&tmp==' ') continue;
            if(flag==1&&!Character.isDigit(tmp)) break;
            else{
                flag=1;
                if(num.length()==0&&(tmp!='+'&&tmp!='-'&&!Character.isDigit(tmp))) return 0;
                if(num.length()!=0&&!Character.isDigit(tmp)) break;
                else num.append(tmp);
            }
        }
        int n;
        if(num.length()==0) return 0;
        if(num.charAt(0)=='-'&&num.length()==1) return 0;
        if(num.charAt(0)=='+'&&num.length()==1) return 0;
        if(num.charAt(0)=='-'){
            try {
                n=Integer.parseInt(num.toString());
            }
            catch (Exception e){
                return -2147483648;
            }
        }
        else {
            try {
                n=Integer.parseInt(num.toString());
            }
            catch (Exception e){
                return 2147483647;
            }
        }
        return n;
    }

    public static int myatoi2(String str){
        if(str.length()==0||str==null)return 0;
        str=str.trim();  //trim（）方法，去掉首尾空白字符
        if(str.length()==0||str==null)return 0;
        double n=0;
        int flag=0;
        int i=0;
        if(str.charAt(0)=='-'){
            i++;
            flag=-1;
            while (i<str.length()&& Character.isDigit(str.charAt(i))){
                n=10*n+str.charAt(i)-'0';
                i++;
            }
        }
        else if(str.charAt(0)=='+'){
            i++;
            flag=1;
            while (i<str.length()&& Character.isDigit(str.charAt(i))){
                n=10*n+str.charAt(i)-'0';
                i++;
            }
        }
        else if(Character.isDigit(str.charAt(0))){
            flag=1;
            while (i<str.length()&&Character.isDigit(str.charAt(i))){
                n=10*n+str.charAt(i)-'0';
                i++;
            }
        }
        else return 0;
        n=n*flag;
        if(n>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(n<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)n;
    }

    public static void main(String[] args) {
        String s=" ";
        System.out.println(myatoi2(s));
    }
}
