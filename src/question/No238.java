package question;

public class No238 {
	public int[] productExceptSelf(int[] nums) {
        int[] re=new int[nums.length];
        int total=1;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]==0){
        		int t=1;
        		for(int j=0;j<nums.length;j++){
        			if(j!=i){
        				t*=nums[j];
        			}
        		}
        		re[i]=t;
        		return re;
        	}
        }
        for(int i:nums){
        	total*=i;
        }
        for(int i=0;i<nums.length;i++){
        	if(nums[i]!=0)
        		re[i]=total/nums[i];
        	
        }
        return re;
    }
}
