package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class No260 {
	public int[] singleNumber(int[] nums) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        HashMap<Integer,Integer> h=new HashMap();
        for(int i:nums){
        	if(!h.containsKey(i)){
        		h.put(i,1);
        	}else{
        		int t=h.get(i);
        		h.put(i,t+1);
        	}
        }
        Iterator iter=h.keySet().iterator();
        while(iter.hasNext()){
        	int key=(int) iter.next();
        	int val=h.get(key);
        	if(val==1){
        		a.add(key);
        	}
        }
        int[] re=new int[a.size()];
        for(int i=0;i<a.size();i++){
        	re[i]=a.get(i);
        }
        return re;
    }
}
