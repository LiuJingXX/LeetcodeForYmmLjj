package Ymm;

/**
 * @ClassName NextPermutation
 * @Description 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * 必须原地修改，只允许使用额外常数空间。
 * @Author manyu
 * @Date 2019/1/5 19:23
 * @Version 1.0
 **/
public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        if(nums.length==0||nums==null) return;
        int flag=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>=nums[i+1]) continue;
            else{
                flag=i;
                break;
            }
        }
        if(flag==-1){
            nums=reverse(0,nums.length-1,nums);
            return;
        }
        if(flag==nums.length-2){
            nums=reverse(nums.length-2,nums.length-1,nums);
            return;
        }
        for(int i=nums.length-1;i>flag;i--){
            if(nums[i]>nums[flag]){
                int temp=nums[flag];
                nums[flag]=nums[i];
                nums[i]=temp;
                nums=reverse(flag+1,nums.length-1,nums);
                return;
            }
            else continue;
        }
    }

    public static int[] reverse(int left,int right,int[] nums){
        int length=right-left+1;
        for(int i=0;i<length/2;i++){
            int temp=nums[left+i];
            nums[left+i]=nums[right-i];
            nums[right-i]=temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums={1,1,5,1,1};
        nextPermutation(nums);
        for(int i:nums) System.out.println(i);
    }
}
