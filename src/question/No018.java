package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No018 {
	public static void main(String args[]){
		int[] num = {1, 0, -1, 0, -2, 2};
		No018 n=new No018();
		System.out.println(n.fourSum(num, 0));
		
	}
	
	public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(nums.length<4 || nums==null){
        	return result;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
        	for(int j=i+1;j<nums.length;j++){
        		int k=j+1;
        		int l=nums.length-1;
        		while(k<l){
        			if(i!=j&&j!=k&&k!=l){
        				if(nums[i]+nums[j]+nums[k]+nums[l]==target){
        					ArrayList<Integer> a=new ArrayList<Integer>();
        					a.add(nums[i]);
        					a.add(nums[j]);
        					a.add(nums[k]);
        					a.add(nums[l]);
        					if(!result.contains(a)){		
        						result.add(a);
        					}
        					k++;
        					l--;
        				}else if(nums[i]+nums[j]+nums[k]+nums[l]<target){
        					k++;
        				}else{
        					l--;
        				}       
        			}
        		}
        	}
        }
        
        return result;
    }
}
