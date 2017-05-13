package question;

import java.util.*;

public class No118 {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<List<Integer>>();
        if(numRows<=0) return l;
        ArrayList<Integer> a1=new ArrayList<Integer>();
        a1.add(1);
        l.add(a1);
        if(numRows==1){
        	return l;
        }  
        for(int i=1;i<numRows;i++){
        	ArrayList<Integer> a=new ArrayList<Integer>();
        	a.add(1);
        	for(int j=1;j<i;j++){
        		ArrayList<Integer> x=(ArrayList) l.get(i-1);
        		int t=x.get(j-1) + x.get(j);
        		a.add(t);
        	}
        	a.add(1);
        	l.add(a);
        }
        return l;
        
    }
}
