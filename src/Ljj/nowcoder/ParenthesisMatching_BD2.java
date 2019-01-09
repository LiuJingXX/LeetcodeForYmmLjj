package Ljj.nowcoder;

/**
 * @ClassName ParenthesisMatching_BD2
 * @Description 字符串包含[]，在开头和结尾添加最少的[]使其匹配，输出匹配字符串.
 * @Author LiuJJ
 * @Date 2019/1/8 11:38
 * @Version 1.0
 **/
public class ParenthesisMatching_BD2 {
    private static String match(String s){
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '['){
                count++;
            }else {
                count--;
            }
            if(count < 0){
                count++;
                sb.append("[");
            }
        }
        sb.append(s);
        while(count > 0){
            sb.append("]");
            count--;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(match("]["));
        System.out.println(match("]]][]][[][[]"));
    }
}
