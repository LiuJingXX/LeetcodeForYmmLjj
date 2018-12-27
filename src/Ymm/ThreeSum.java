package Ymm;

import java.util.*;

/**
 * @ClassName ThreeSum
 * @Description 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * @Author manyu
 * @Date 2018/12/27 19:45
 * @Version 1.0
 **/
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        //List<Integer> l = new ArrayList<>();
        //list.add(l);
        Arrays.sort(nums);
        if(nums[nums.length-1]<0 || nums[0]>0) return list;
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                if(left!=i+1 && nums[left]==nums[left-1]){
                    left++;
                    continue;
                }
                if(right!=nums.length-1 && nums[right]==nums[right+1]){
                    right--;
                    continue;
                }
                if(nums[left]+nums[right]==-nums[i]){
                    List<Integer> l=new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[left]);
                    l.add(nums[right]);
                    list.add(l);
                    left++;
                    right--;
                }
                else if(nums[left]+nums[right]<-nums[i]) left++;
                else if(nums[left]+nums[right]>-nums[i]) right--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums={0,0,0};
        System.out.println(threeSum(nums));
    }
}
