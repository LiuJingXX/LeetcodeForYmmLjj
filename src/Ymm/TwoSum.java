package Ymm;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twosum(int[] nums,int target){
        Map<Integer,Integer> dict = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){

            if(dict.containsKey(target-nums[i])){

                return new int[]{dict.get(target-nums[i]),i};
            }
            dict.put(nums[i],i);
        }
        return new int[]{};
    }


    public static void main(String[] args){
        int[] nums = new int[]{2,7,11,15};
        int target=9;
        System.out.println(twosum(nums,target));

    }

}
