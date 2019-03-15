package question;

import java.util.ArrayList;
import java.util.List;

public class No017 {
	private ArrayList<String> result = new ArrayList<>();
	String[] chars = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public List<String> letterCombinations(String digits) {
		if (digits.length()==0){
			return result;
		}
		char[] dis = digits.toCharArray();
		help(dis,0,new StringBuilder());
		return result;
	}

	private void help(char[] digits, int now, StringBuilder sb){
		if (now >= digits.length){
			result.add(sb.toString());
			return;
		}
		int index = digits[now] - 48;
		char[] dd = chars[index].toCharArray();
		for (char s:dd){
			sb.append(s);
			help(digits, now+1, sb);
			sb.deleteCharAt(sb.length()-1);
		}
	}
}
