package question;

import java.util.List;
import java.util.ArrayList;

public class No022 {
	List<String> result=new ArrayList<String>();
	public List<String> generateParenthesis(int n) {
        
        int l=n;
        int r=n;
        help("",l,r);
        return result;
    }
	
	public void help(String s,int l,int r){
		if(l>r){
			return;
		}
		if(l==0&&r==0){
			result.add(s);
		}
		if(l>0){
			help(s+"(",l-1,r);
		}
		if(r>0){
			help(s+")",l,r-1);
		}

	}
}
