package question;

public class No041 {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0){
            return 1;
        }
        int i=0;
        while(i<nums.length){
            if(nums[i]>=1 && nums[i]<=nums.length && nums[i]!=i+1 && nums[nums[i]-1] != nums[i]){
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }else {
                i++;
            }
        }
        for (int k=0;k<nums.length;++k){
            if (nums[k] != k+1){
                return k+1;
            }
        }
        return nums.length+1;
    }
}
