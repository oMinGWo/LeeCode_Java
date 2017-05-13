package question;

import java.util.*;
public class No119 {
	public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(1);
        if(rowIndex==0) return l;
        l.add(1);
        if(rowIndex==1) return l;
        for(int i=1;i<rowIndex;i++){
        	ArrayList<Integer> a=new ArrayList<Integer>();
        	a.add(1);
        	for(int j=1;j<=i;j++){
        		int t=l.get(j-1) + l.get(j);
        		a.add(t);
        	}
        	a.add(1);
        	l=a;
        }
        
        return l;
    }
}
