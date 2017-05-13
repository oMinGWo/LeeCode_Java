package question;

import java.util.ArrayList;
import java.util.List;

public class No448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		ArrayList<Integer> re=new ArrayList<Integer>();
        int[] x=new int[nums.length];
        for(int i=0;i<x.length;++i){
        	x[i]=-1;
        }
        
        for(int i:nums){
        	x[i-1]=i;
        }
        for(int i=0;i<x.length;++i){
        	if(x[i]==-1)
        		re.add(i+1);
        }
        return re;
    }
}
