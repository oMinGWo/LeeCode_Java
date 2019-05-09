package question;

public class No704 {
    public int search(int[] nums, int target) {
        return help(nums,0, nums.length-1,target);
    }

    private int help(int[] nums, int low, int high, int target){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]<target){
            low=mid+1;
        }else {
            high=mid-1;
        }
        return help(nums,low,high,target);
    }
}
