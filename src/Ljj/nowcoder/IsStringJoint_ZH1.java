package Ljj.nowcoder;

/**
 * @ClassName IsStringJoint_ZH1
 * @Description 找到s的最长重复子串，否则返回false;
 * @Author LiuJJ
 * @Date 2019/1/10 19:00
 * @Version 1.0
 **/
public class IsStringJoint_ZH1 {
    private static int size(int a,int b){
        int n = b/a;
        for(int i = 2;i*i <= n;i++){
            if(n%i == 0){
                return a*n/i;
            }
        }
        return a;
    }
    private static String judge(String s){
        String fal = "false";
        if(s.length() < 2){
            return fal;
        }
        String ss = s + s;
        int len = s.length(),count = 0;
        int k = ss.indexOf(s,1);
        if(k == len){
            return fal;
        }else{
            return s.substring(0,size(k,len));
        }
    }
    private static String judge2(String s){
        int len = 2;
        while(s.length() + 1 > len * 2 ){
            if(s.length()%len != 0){
                len++;
                continue;
            }else{
                StringBuilder sb = new StringBuilder();
                for(int i = 0;i < len;i++){
                    sb.append(s.substring(0,s.length()/len));
                }
                if(sb.toString().equals(s)){
                    return s.substring(0,s.length()/len);
                }
                len++;
            }
        }
        return "false";
    }

    public static void main(String[] args) {
        String s = "abcabcabcabcabcabc";
        String s1 = "asfkjsbfsafnkjanfkjqwfkjsac";
        String s2 = "aassddffgghhjjaassddffgghhjjaassddffgghhjj";
        System.out.println(System.currentTimeMillis());
        System.out.println(judge(s));
        System.out.println(judge(s1));
        System.out.println(judge(s2));
        System.out.println(System.currentTimeMillis());
        System.out.println(judge2(s));
        System.out.println(judge2(s1));
        System.out.println(judge2(s2));
        System.out.println(System.currentTimeMillis());
    }
}
