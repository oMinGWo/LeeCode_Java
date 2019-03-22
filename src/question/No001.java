package question;

import java.util.Arrays;
import java.util.HashMap;

public class No001 {
	
	public static void main(String args[]){
		No001 n=new No001();
		int[] x={3,3};
		System.out.println(Arrays.toString(n.twoSum(x, 6)));
	}

	
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;++i){
			map.put(nums[i],i);
		}
		int[] re=new int[2];
		for(int i=0;i<nums.length;++i){
			int left=target-nums[i];
			if(map.containsKey(left) && map.get(left) != map.get(nums[i])){
				re[1]=map.get(left);
				re[0]=map.get(nums[i]);
				break;
			}
		}
		return re;
	}
}
