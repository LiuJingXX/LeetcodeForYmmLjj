package Ljj.nowcoder;

/**
 * @ClassName MagicalNumber_JD2
 * @Description 求l->n内的神奇数，神奇数为：n的数字可以分为两组，两组数字和相等。
 * 例如134，1+3 = 4。
 * @Author LiuJJ
 * @Date 2019/1/10 18:49
 * @Version 1.0
 **/
public class MagicalNumber_JD2 {
     private static int getMagical(int l,int r){
         int count = 0;
         for(int i = l;i <= r;i++){
             if(isMagic(i)){
                 count++;
             }
         }
         return count;
     }
     private static boolean isMagic(int n){
         int[] nums = new int[10];
         int sum = 0,cur = 0;
         while(n > 0){
             nums[cur] = n%10;
             sum += n%10;
             cur++;
             n /= 10;
         }
         if(sum%2 == 1){
             return false;
         }
         sum /= 2;
         boolean[] f = new boolean[41];
         f[nums[0]] = true;
         for(int i = 1;i < cur;i++){
             int value = nums[i];
             for(int j = 40;j >= 0;--j){
                 if(f[j] && j + value <= 40){
                     f[j + value] = true;
                 }
             }
             if(f[sum]){
                 return true;
             }
         }
         return false;
     }

    public static void main(String[] args) {
        System.out.println(getMagical(100000,100000000));
    }
}
