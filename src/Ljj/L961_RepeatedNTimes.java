package Ljj;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName L961_RepeatedNTimes
 * @Description 一个长度为2N的数组，包含了N + 1个不同元素，且有一个元素出现了N次，求N
 * @Author LiuJJ
 * @Date 2019/1/4 23:26
 * @Version 1.0
 **/
public class L961_RepeatedNTimes {
    public static int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i:A){
            if(!set.add(i)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test = {5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(test));
    }
}
