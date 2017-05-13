package question;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class No387 {
	public static void main(String args[]){
		String s="leetcode";
		No387 n=new No387();
		System.out.println(n.firstUniqChar(s));
	}
	public int firstUniqChar(String s) {
		
		//TODO
        HashMap<Character,Integer> h=new HashMap();
        char[] x=s.toCharArray();
        for(char i:x){
        	if(h.containsKey(i)){
        		int t=h.get(i);
        		t++;
        		h.put(i,t);
        	}else{
        		h.put(i,1);
        	}
        }
        for(int i=0; i<s.length(); i++){  
            char c = s.charAt(i);  
            if(h.get(c) == 1){  
                return i;  
            }  
        }  
        return -1; 
    }
}
