package question;

public class No303 {

    int[] sums ;

    public No303(int[] nums) {
        if (nums == null || nums.length==0) {
            return;
        }
        sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i=1;i<nums.length;++i){
            sums[i] = sums[i-1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if (i==0){
            return sums[j];
        }
        return sums[j] - sums[i-1];
    }
}
