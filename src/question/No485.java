package question;

import java.util.ArrayList;

public class No485 {
	public int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> index=new ArrayList<Integer>();
        index.add(-1);
        for(int i=0;i<nums.length;++i){
        	if(nums[i]==0)
        		index.add(i);
        }
        index.add(nums.length);
        int max=-1;
        for(int i=0;i<index.size()-1;++i){
        	int temp=index.get(i+1)-index.get(i);
        	if(temp>max)
        		max=temp;
        }
		return max-1;
    }
}
