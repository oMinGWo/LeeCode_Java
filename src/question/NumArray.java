package question;

public class NumArray {
	int[] sum;
	public NumArray(int[] nums) {
        if(nums==null) {
            sum = null;
        } else if(nums.length==0) {
            sum = new int[0];
        } else{
        	sum=new int[nums.length];
        	sum[0]=nums[0];
        	for(int i=1;i<nums.length;i++){
        		sum[i]=sum[i-1]+nums[i];
        	}
        }
    }

    public int sumRange(int i, int j) {
        if(sum==null) {
            return 0;
        }
        if(i>sum.length||j>sum.length||i>j) {
            return 0;
        } else if(i==0) {
            return sum[j];
        } else {
            return sum[j] - sum[i];
        }
    }
}
