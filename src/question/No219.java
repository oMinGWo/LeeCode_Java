package question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class No219 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if (nums.length <= 1) {
            return false;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i]) && i - hashMap.get(nums[i]) <= k) {
                return true;
            }
            hashMap.put(nums[i], i);
        }
        
        return false;
		/*Set<Integer> s=new HashSet<Integer>();
		int start=0;
		int end=0;
		for(int i=0;i<nums.length;i++){
			if(!s.contains(nums[i])){
				s.add(nums[i]);
				end++;
			}else{
				return true;
			}
			if(end-start>k){
				s.remove(nums[start]);
				start++;
			}
		}
		return false;*/
    }
}
