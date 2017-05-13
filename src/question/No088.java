package question;

public class No088 {
	public static void main(String args[]){
		No088 nn=new No088();
		int[] n1={2,0};
		int[] n2={1};
		int m=1;
		int n=1;
		nn.merge(n1,m,n2,n);
	}
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int index=m+n-1;
		int i=m-1;
		int j=n-1;
		while(i>=0 && j>=0){
			if(nums1[i]<nums2[j]){
				nums1[index--]=nums2[j--];
			}else{
				nums1[index--]=nums1[i--];
			}
		}
		while(i>=0){
			nums1[index--]=nums1[i--];
		}
		while(j>=0){
			nums1[index--]=nums2[j--];
		}
    }
}
