package Ljj;

/**
 * @ClassName L365_MeasureWater
 * @Description 由x和y升的水壶，能否得到z升水。
 * @Author LiuJJ
 * @Date 2019/2/27 13:54
 * @Version 1.0
 **/
public class L365_MeasureWater {
    public static boolean canMeasureWater(int x,int y,int z){
        if(x + y < z){
            return false;
        }
        if(x + y == z){
            return true;
        }
        if(x > y){
            int tmp = x;
            x = y;
            y = tmp;
        }
        int tmp1 = 0;
        int tmp2 = y;
        while(tmp1 < y){
            tmp1 += x;
        }
        tmp1 -= y;
        while(tmp2 > x){
            tmp2 -= x;
        }
        if(tmp1 == z || tmp2 == z|| tmp1 + y == z || tmp2 + y == z){
            return true;
        }
        while(tmp1 < z){
            tmp1 += x;
            if(tmp1 == z){
                return true;
            }
        }
        while(tmp2 < z){
            tmp2 += x;
            if(tmp2 == z){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canMeasureWater(3,5,4));
        System.out.println(canMeasureWater(2,6,5));
    }
}
