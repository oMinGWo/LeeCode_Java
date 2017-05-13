package question;

public class No035 {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0]) return 0;
        if(target>nums[nums.length-1]) return nums.length;
        for(int i=0;i<nums.length;++i) {
            if (nums[i] == target) return i;
        }

        for(int i=0;i<nums.length-1;++i){
            if(target>nums[i] && target<nums[i+1])
                return i+1;
        }
        return -1;
    }
}
