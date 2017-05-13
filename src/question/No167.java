package question;

public class No167 {
	public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int[] re=new int[2];
        while(i<j){
        	int x=numbers[i]+numbers[j];
        	if(x==target){
        		re[0]=i+1;
        		re[1]=j+1;
        	}
        	if(x<target) i++;
        	if(x>target) j--;
        }
        return re;
    }
}
