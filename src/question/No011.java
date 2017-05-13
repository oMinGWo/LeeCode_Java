package question;

public class No011 {
	public int maxArea(int[] height) {
        int max=-1;
        int i=0;
        int j=height.length-1;
        while(i<j){
        	if(height[i]<height[j]){
        		if((j-i)*height[i]>max){
        			max=(j-i)*height[i];
        		}
        		i++;
        	}else{
        		if((j-i)*height[j]>max){
        			max=(j-i)*height[j];
        		}
        		j--;
        	}
        }
        return max;
    }

}
