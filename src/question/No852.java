package question;

public class No852 {
    public int peakIndexInMountainArray(int[] A) {
        return help(A,0,A.length-1);
    }

    private int help(int[] nums, int low, int high){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(mid>0 && mid<nums.length-1){
            if(nums[mid]>nums[mid-1] && nums[mid] > nums[mid+1]){
                return mid;
            }else if(nums[mid]<nums[mid+1] || nums[mid] > nums[mid-1]){
                low=mid+1;
            }else if(nums[mid]>nums[mid+1] || nums[mid] < nums[mid-1]){
                high=mid-1;
            }
            return help(nums, low, high);
        }
        return -1;
    }
}
