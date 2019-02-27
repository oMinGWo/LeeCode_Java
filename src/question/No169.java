package question;

import java.util.HashMap;

public class No169 {
	public static void main(String args[]){
		int[] num={3,2,3};
		No169 n=new No169();
		System.out.println(n.majorityElement2(num));
		
	}
	public int majorityElement2(int[] nums){
		if (nums == null || nums.length==0){
			return 0;
		}
		int result = nums[0];
		int times = 1;
		for (int i=1;i<nums.length;++i){
			if (times == 0){
				result = nums[i];
				times = 1;
			}else if(nums[i] == result){
				times ++;
			}else {
				times --;
			}
		}
		return result;
	}

	public int majorityElement(int[] nums) {
		if(nums==null || nums.length<=0){
			return 0;
		}
        int len=nums.length;
        if(len<3){
        	return nums[0];
        }
        int m=len/2+len%2;

        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        for(int key:nums){
        	if(!h.containsKey(key)){
        		h.put(key,1);
        	}else{
        		int x=h.get(key);
        		if(x+1>=m){
        			return key;
        		}
        		h.put(key,x+1);
        	}
        }
        return 0;
    }
}
