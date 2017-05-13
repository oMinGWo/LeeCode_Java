package question;

import java.util.*;

public class No136 {
	public int singleNumber(int[] nums) {
		int result = 0 ^ nums[0];
		for (int i = 1; i < nums.length; i++) {
			result = result ^ nums[i];
		}
		return result;
	}
}
