package Ymm;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        //StringBuilder temp=new StringBuilder(strs[0]);
        StringBuilder longest=new StringBuilder(strs[0]);
        for(int i=0;i<strs.length;i++){
            int length;
            if(strs[i].length()<longest.length()) {
                //temp=new StringBuilder(strs[i]);
                length=strs[i].length();
            }
            else {
                //temp=new StringBuilder(strs[i]);
                length=longest.length();
            }
            StringBuilder s=new StringBuilder("");
            for(int j=0;j<length+1;j++){
                if(strs[i].substring(0,j).equals(longest.substring(0,j))){
                    s=new StringBuilder(longest.substring(0,j));
                }
            }
            //temp=s;
            longest=s;
        }
        if(longest.length()==0) return "";
        else return longest.toString();
    }

    public static String startwith(String[] strs){
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        String longest=strs[0];
        for(int i=0;i<strs.length;i++){
            while (!strs[i].startsWith(longest)){
                longest=longest.substring(0,longest.length()-1);
                if(longest.length()==0) return "";
            }
        }
        return longest;
    }


    public static void main(String[] args) {
        String[] strs=new String[3];
        String[] s=new String[1];

        strs[0]="flight";
        strs[1]="flow";
        strs[2]="flower";
        //strs[2]="flyight";
        //System.out.println(longestCommonPrefix(strs));
        System.out.println(startwith(strs));
    }
}
