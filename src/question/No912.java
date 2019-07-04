package question;

public class No912 {
    public int[] sortArray(int[] nums) {
        for (int gap=nums.length/2;gap>0;gap/=2){
            for (int i=gap;i<nums.length;++i){
                for (int j=i-gap;j>=0&&nums[j+gap]>nums[j];j-=gap){
                    int temp = nums[j];
                    nums[j] = nums[j+gap];
                    nums[j+gap] = temp;
                }
            }
        }
        return nums;
    }
}
