package question;

public class No215 {
    public int findKthLargest(int[] nums, int k) {
        return help(nums, 0, nums.length-1, k);
    }

    public static int help(int[] nums, int low, int high, int k) {
        if (low >= high) {
            return nums[high];
        }
        int i = low;
        int j = high-1;
        int pivot = high;
        while(true){
            while(i >= 0 && nums[i] < nums[pivot]) {
                i++;
            }
            while(j >= 0 && nums[j] >= nums[pivot]){
                j--;
            }
            if (i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }else {
                break;
            }
        }
        int temp = nums[i];
        nums[i] = nums[pivot];
        nums[pivot] = temp;
        if (i==nums.length-k){
            return nums[i];
        }else if(i < nums.length-k){
            return help(nums, i+1, high,k);
        }else {
            return help(nums, low,i-1, k);
        }
    }
}
