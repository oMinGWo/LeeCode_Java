package question;

public class No283 {
	public static void main(String args[]){
		No283 n=new No283();
		int[] num={0,1,0,2,3,4,6};
		n.moveZeroes(num);
	}
	public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]!=0){
        		nums[j]=nums[i];
        		j++;
        	}
        }
        while(j<nums.length){
        	nums[j]=0;
        	j++;
        }
    }
}
