package Ymm;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int index=0;
        int tmp=nums[0];
        for (int i=1;i<nums.length;i++){
            if(nums[i]==tmp) continue;
            else {
                index++;
                nums[index]=nums[i];
                tmp=nums[i];
            }
        }
        return index+1;
    }

    public static void main(String[] args) {
        int[] a = {1,1,2,3,3};
        System.out.println(removeDuplicates(a));
    }
}
