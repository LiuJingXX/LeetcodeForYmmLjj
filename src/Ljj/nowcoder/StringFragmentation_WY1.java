package Ljj.nowcoder;

/**
 * @ClassName StringFragmentation_WY1
 * @Description 由小写字母组成的字符串由相同字符的碎片组成。求所有碎片的平均长度
 * s = "aaasssssdddff"
 * out = (3+5+3+2)/4 = 3.25
 * @Author LiuJJ
 * @Date 2019/1/9 10:11
 * @Version 1.0
 **/
public class StringFragmentation_WY1 {
    private static double getAverage(String str){
        if(str.length() < 2){
            return (double)str.length();
        }
        char tmp = str.charAt(0);
        int count = 1;
        int size = 0;
        for(int i = 1;i < str.length();i++){
            if(str.charAt(i) == tmp){
                count++;
            }else{
                tmp = str.charAt(i);
                size++;
                count = 1;
            }
        }
        if(count > 0&&tmp != str.charAt(0)){
            size++;
        }
        return str.length()/(double)size;
    }

    public static void main(String[] args) {
        System.out.println(getAverage("aaabbaaac"));
    }
}
