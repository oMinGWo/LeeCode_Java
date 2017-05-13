package question;

import java.util.ArrayList;
import java.util.Arrays;

public class No350 {
	public int[] intersect(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int len=len1<len2?len1:len2;
        ArrayList<Integer> a=new ArrayList<Integer>();
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int k=0;
        int i=0,j=0;
        while(i<len1&&j<len2){
        	if(nums1[i]<nums2[j]){
        		i++;
        		continue;
        	}else if(nums1[i]>nums2[j]){
        		j++;
        		continue;
        	}else{
        		a.add(nums1[i]);
        		i++;
        		j++;
        		k++;
        	}
        }
        k=0;
        int[] result=new int[a.size()];
        for(k=0;k<a.size();k++){
        	result[k]=a.get(k);
        }
        return result;
    }
}
