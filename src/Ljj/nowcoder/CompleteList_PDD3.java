package Ljj.nowcoder;

/**
 * @ClassName CompleteList_PDD3
 * @Description 没意义的题
 * @Author LiuJJ
 * @Date 2019/1/17 17:00
 * @Version 1.0
 **/
public class CompleteList_PDD3 {
    private static int[] complete(int[] a){
        int[] res = new int[4];
        int off = a[0];
        int n = a[1];
        int l1 = a[2];
        int l2 = a[3];
        if(off <= l1){
            int tmp = l1 - off;
            if(tmp >= n){
                res[0] = off;
                res[1] = off + n;
                res[2] = res[3] = 0;
            }else{
                res[0] = off;
                res[1] = l1;
                res[2] = 0;
                res[3] = l2 + l1 - off - n;
            }
        }else if(off > l1 && off <= l1 + l2){
            res[0] = res[1] = l1;
            res[2] = off - l1;
            res[3] = off + n >= (l1 + l2)?l2:(off + n - l1);
        }else{
            res[0] = res[1] = l1;
            res[2] = res[3] = l2;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {2,4,4,4};
        int[] b = {1,2,4,4};
        int[] c = {4,1,3,3};
        for(int i:complete(a)){
            System.out.print(i + ",");
        }
        System.out.println();
        for(int i:complete(b)){
            System.out.print(i + ",");
        }
        System.out.println();
        for(int i:complete(c)){
            System.out.print(i + ",");
        }
    }
}
