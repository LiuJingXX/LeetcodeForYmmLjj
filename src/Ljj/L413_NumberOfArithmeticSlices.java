package Ljj;

/**
 * @ClassName L413_NumberOfArithmeticSlices
 * @Description 数组中等差子数列的个数
 * @Author LiuJJ
 * @Date 2019/1/12 16:03
 * @Version 1.0
 **/
public class L413_NumberOfArithmeticSlices {
    private static int numberOfArithmeticSlices(int[] a){
        int i = 0,len = 0,sum = 0;
        while(i < a.length - 2){
            int start = i;
            while(a[start] + a[start + 2] == 2*a[start + 1]){
                len++;
                start++;
                if(start == a.length - 2){
                    //sum += add(len + 2);
                    break;
                }
            }
            sum += add(len + 2);
            len = 0;
            i = start + 1;
        }
        return sum;
    }
    private static int add(int n){
        return (n - 2)*(n - 1)/2;
    }
    //easy solution
    private static int getEasy(int[] a){
        int sum = 0,tag = 0;
        for(int i = 0;i < a.length - 2;i++){
            if(a[i] + a[i + 2] == 2*a[i + 1]){
                tag++;
                sum += tag;
            }else{
                tag = 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {1,1,3,5,7,8,10};
        System.out.println(numberOfArithmeticSlices(a));
        System.out.println(numberOfArithmeticSlices(b));
        System.out.println(getEasy(a));
        System.out.println(getEasy(b));
    }
}
