package question;


public class No189 {
	public static void main(String args[]){
		int[] nums={1,2,3};
		int k=2;
		No189 n=new No189();
		n.rotate(nums, k);
	}
	public void rotate(int[] nums, int k) {
		int len=nums.length;
		if(k%len==0) return;
		int step=k%len;
		int[] fore=new int[step];
		int[] back=new int[len-step];
		for(int i=0;i<step;i++){
			fore[i]=nums[len-step+i];
		}
		for(int i=0;i<len-step;i++){
			back[i]=nums[i];
		}
		print(fore);
		print(back);
		for(int i=0;i<step;i++){
			nums[i]=fore[i];
		}
		for(int i=step;i<len;i++){
			nums[i]=back[i-step];
		}
    }
	public static void print(int[] a){
		for(int i:a){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
