package question;

import java.util.ArrayList;

public class No349 {
	public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i:nums1){
        	for(int j:nums2){
        		if(i==j && !a.contains(i))
        			a.add(i);
        	}
        }
        int[] x=new int[a.size()];
        for(int i=0;i<x.length;i++){
        	x[i]=a.get(i);
        }
        return x;
    }
}
