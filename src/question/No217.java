package question;

import java.util.HashMap;

public class No217 {
	public boolean containsDuplicate(int[] nums) {
        int len=nums.length;
        if(len==0){
        	return false;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int key:nums){
        	if(!map.containsKey(key)){
        		map.put(key,1);
        	}else{
        		return false;
        	}
        }
        return true;
    }
}
