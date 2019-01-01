package Ymm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName FourSum
 * @Description 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 * @Author manyu
 * @Date 2019/1/1 19:21
 * @Version 1.0
 **/
public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        //List<Integer> l=new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length<=3||nums==null) return list;
        if(nums[0]+nums[1]+nums[2]+nums[3]>target||nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3]+nums[nums.length-4]<target) return list;
        for(int i=0;i<nums.length;i++){
            if(i!=0&&nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if(j!=i+1&&nums[j]==nums[j-1]) continue;
                int left=j+1;
                int right=nums.length-1;
                while (left<right)
                {
                    if(left!=j+1&&nums[left]==nums[left-1]){
                        left++;
                        continue;
                    }
                    if(right!=nums.length-1&&nums[right]==nums[right+1]){
                        right--;
                        continue;
                    }
                    if(nums[left]+nums[right]==target-(nums[i]+nums[j])){
                        List<Integer> l=new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[left]);
                        l.add(nums[right]);
                        list.add(l);
                        right--;
                        left++;
                    }
                    else if(nums[left]+nums[right]<target-(nums[i]+nums[j])){
                        left++;
                        continue;
                    }
                    else if(nums[left]+nums[right]>target-(nums[i]+nums[j])){
                        right--;
                        continue;
                    }
                }
            }
        }
        return list;
    }


    public static void main(String[] args) {
        //int[] nums={1, 0, -1, 0, -2, 2};
        int[] nums={};
        int target=0;
        System.out.println(fourSum(nums,target));
    }
}
