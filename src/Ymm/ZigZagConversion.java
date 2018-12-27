package Ymm;

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        if(s==null || s.length()==0)return "";
        if(s.length()==1||numRows==1) return s;
        StringBuilder str=new StringBuilder();
        Character[][] ch=new Character[numRows][s.length()];
        int group=numRows*2-2;
        int column=0;
        int row=-1;
        if(numRows==2){
            for(int i=0;i<s.length();i+=2) str.append(s.charAt(i));
            for(int i=1;i<s.length();i+=2) str.append(s.charAt(i));
            return str.toString();
        }
        for(int i=0;i<s.length();i++){
            if((i+1)%group<=numRows && (i+1)%group!=0){
                row++;
                ch[row][column]=s.charAt(i);
            }
            else if((i+1)%group>numRows){
                column++;
                row--;
                ch[row][column]=s.charAt(i);
            }
            else if((i+1)%group==0){
                column++;
                row--;
                ch[row][column]=s.charAt(i);
                column++;
                row-=2;
            }
        }

        for(int i=0;i<numRows;i++){
            for(int j=0;j<column+1;j++){
                if(ch[i][j]!=null){
                    str.append(ch[i][j]);
                }
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s="A,Bbb";
        System.out.println(convert(s,3));
    }
}
