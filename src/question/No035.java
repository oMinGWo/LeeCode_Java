package question;

public class No035 {
    public int searchInsert(int[] nums, int target) {
        return search(nums, target, 0, nums.length-1);
    }
    private int search(int[] nums, int target, int low, int high){
        if(target <= nums[low]){
            return low;
        }
        if(target >= nums[high]){
            return high+1;
        }
        if(low == high){
            return high;
        }
        int mid = (low + high) / 2;
        int midv = nums[mid];
        if(target == midv){
            return mid;
        }else if(target < midv){
            high = mid - 1;
        }else{
            low = mid + 1;
        }
        return search(nums, target, low, high);
    }
}
