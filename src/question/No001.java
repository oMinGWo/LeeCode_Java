package question;

public class No001 {
	
	public static void main(String args[]){
		No001 n=new No001();
		int[] x={3,2,4};
		n.twoSum(x,6);
	}

	
	public int[] twoSum(int[] nums, int target) {
		int[] x = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					x[0] = i;
					x[1] = j;
				}
			}
		}
		return x;
	}
}
