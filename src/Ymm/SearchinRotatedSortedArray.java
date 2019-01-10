package Ymm;

/**
 * @ClassName SearchinRotatedSortedArray
 * @Description 假设按照升序排序的数组在预先未知的某个点上进行了旋转。( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 *搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。你可以假设数组中不存在重复的元素。
 *你的算法时间复杂度必须是 O(log n) 级别。
 * @Author manyu
 * @Date 2019/1/10 19:10
 * @Version 1.0
 **/
public class SearchinRotatedSortedArray {
    public static int search(int[] nums, int target) {
        if(nums.length==0||nums==null) return -1;
        int left=0;
        int right=nums.length-1;
        int index=-1;
        int mid;
        while (left<=right){
            mid=(left+right)/2;
            if(nums[left]==target) return left;
            if(nums[right]==target) return right;
            if(nums[mid]==target) return mid;
            if(nums[mid]>nums[right]){    //左半边有序
                if(nums[mid]>target&&nums[left]<target) right=mid-1;
                else left=mid+1;
            }
            else{   //mid小于right，右半边有序
                if(nums[mid]<target&&nums[right]>target) left=mid+1;
                else right=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int t=6;
        System.out.println(search(nums,t));
    }
}
