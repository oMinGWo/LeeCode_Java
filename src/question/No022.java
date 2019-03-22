package question;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class No022 {
	List<String> result=new ArrayList<String>();
	public List<String> generateParenthesis(int n) {
		help(n,n,"");
		return result;
    }
    private void help(int lleft, int rleft, String s){
		if (lleft>rleft){
			return;
		}
		if (lleft==0&&rleft==0){
			result.add(s);
		}
		if (lleft>0){
			help(lleft-1,rleft,s+"(");
		}
		if (rleft>0){
			help(lleft,rleft-1,s+")");
		}
	}
}
