package Ljj.nowcoder;

/**
 * @ClassName MaxChocolate_TX4
 * @Description 出差n天，m块巧克力，每天吃的巧克力不少于前一天的一半，求第一天最多多少块.
 * @Author LiuJJ
 * @Date 2019/1/13 22:36
 * @Version 1.0
 **/
public class MaxChocolate_TX4 {
    private static int sum(int n,int s){
        int res = 0;
        for(int i = 0;i < n;i++){
            res += s;
            s = (s + 1)>>1;
        }
        return res;
    }
    private static int getMax(int n,int m){
        int start = 0,end = m;
        while(start <= end){
            int mid = (start + end + 1)>>1;
            if(sum(n,mid) == m){
                return mid;
            }else if(sum(n,mid) < m){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(getMax(3,7));
    }
}
