package question;

public class No027 {
	public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
        	if(nums[i]==val){
        		if(nums[j]==val){
        			j--;
        		}else{
        			nums[i]=nums[j];
        			i++;
        			j--;
        		}
        	}else{
        		i++;
        	}
        }
        
        return i;
    }
}
