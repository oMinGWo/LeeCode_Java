package question;

public class No496 {
	public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] re=new int[findNums.length];
        for(int i=0;i<findNums.length;++i){
        	int a=findNums[i];
        	for(int j=0;i<nums.length;++i){
        		if(nums[j]==a){
        			System.out.println(j);
        			re[i]=help(j,nums);
        		}
        	}
        }
		return re;
    }
	
	public int help(int index,int[] nums){
		int a=nums[index];
		for(int i=index+1;i<nums.length;++i){
			if(nums[i]>a){
				return nums[i];
			}
		}
		return -1;
	}
}
