package question;

public class No034 {
    public int[] searchRange(int[] nums, int target) {
        int left=helpLeft(nums, 0, nums.length-1, target);
        int right=helpRight(nums, 0, nums.length-1,target);
        int[] re=new int[2];
        re[0]=left;
        re[1]=right;
        return re;
    }
    private static int helpLeft(int[] nums, int low, int high, int target){
        if (low > high){
            return -1;
        }
        int mid = (low+high)/2;
        if (target == nums[mid]){
            if (mid == low || nums[mid]>nums[mid-1]){
                return mid;
            }else{
                high = mid - 1;
            }
        }else if (target > nums[mid]){
            low = mid + 1;
        }else {
            high = mid - 1;
        }
        return helpLeft(nums, low, high, target);
    }
    private static int helpRight(int[] nums, int low, int high, int target){
        if (low > high){
            return -1;
        }
        int mid = (low+high)/2;
        if (target == nums[mid]){
            if (mid == high || nums[mid]<nums[mid+1]){
                return mid;
            }else{
                low = mid + 1;
            }
        }else if (target > nums[mid]){
            low = mid + 1;
        }else {
            high = mid - 1;
        }
        return helpRight(nums, low, high, target);
    }
}
