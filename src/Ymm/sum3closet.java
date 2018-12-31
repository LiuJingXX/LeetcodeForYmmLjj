package Ymm;

import java.util.Arrays;

/**
 * @ClassName sum3closet
 * @Description 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。
 * 返回这三个数的和。假定每组输入只存在唯一答案。
 * @Author manyu
 * @Date 2018/12/29 22:09
 * @Version 1.0
 **/
public class sum3closet {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=0;
        if(nums[0]+nums[1]+nums[2]>=target) return nums[0]+nums[1]+nums[2];
        if(nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3]<=target)
            return nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3];
        int tmp=Math.abs(target-nums[0]-nums[1]-nums[nums.length-1]);
        if(tmp==target) return target;
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right]-target==0) return target;
                else if (nums[i]+nums[left]+nums[right]-target <0){
                    if(tmp>Math.abs(target-nums[i]-nums[left]-nums[right])) {
                        tmp=Math.abs(target-nums[i]-nums[left]-nums[right]);
                        res=nums[i]+nums[left]+nums[right];
                    }
                    left++;
                }
                else if(nums[i]+nums[left]+nums[right]-target >0){
                    if(tmp>Math.abs(target-nums[i]-nums[left]-nums[right])) {
                        tmp=Math.abs(target-nums[i]-nums[left]-nums[right]);
                        res=nums[i]+nums[left]+nums[right];
                    }
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={-1,2,1,-4};
        int target=1;
        System.out.println(threeSumClosest(nums,target));
    }
}
