package question;

public class No033 {
    //大概的思路就是，先判断数组是否有序，有序就二分
    //无序的话，直接分成左右两半，在左边有右边分别找
    public int search(int[] nums, int target) {
        return help(nums,0,nums.length-1,target);
    }
    private int help(int[] nums, int start, int end, int target){
        if (start > end) {
            return -1;
        }
        if (nums[start] < nums[end]) {
            return twoFen(nums, start, end, target);
        }
        int index = (start+end)/2;
        int middleValue = nums[index];
        if (middleValue == target) {
            return index;
        }
        int left = help(nums, start, index-1, target);
        int right = help(nums, index+1,end, target);
        return left == -1?right:left;
    }

    private int twoFen(int[] nums, int start, int end, int target){
        if (start > end) {
            return -1;
        }
        int index = (start+end)/2;
        int middleValue = nums[index];
        if (middleValue == target) {
            return index;
        }else if (target > middleValue) {
            return twoFen(nums, index+1,end, target);
        }else {
            return twoFen(nums, start, index-1, target);
        }
    }
}