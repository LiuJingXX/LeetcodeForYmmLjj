package Ljj.nowcoder;

/**
 * @ClassName WY5
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/3/17 22:30
 * @Version 1.0
 **/
public class WY5 {
    public static void main(String[] args) {
        int m=3;
        int n=0;
        int res;
        int tmp=Math.max(Math.abs(m),Math.abs(n));
        int x=-tmp,y=tmp,z=(tmp*2)*(tmp*2);
        int t=z-2*tmp,b=z+2*tmp;
        if(m==x){
            res=z+(y-n);
        }
        else if(n==y){
            res=z-(m-x);
        }
        else if(n==-y){
            res=b+(n-x);
        }
        else {
            res=t-(y-n);
        }
        System.out.println(res);
    }
}
