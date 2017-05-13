package question;

public class No058 {
	public int lengthOfLastWord(String s) {
		s=s.trim();
		if(s.length()==0) return 0;
		String[] t=s.split(" ");
		return t[t.length-1].length();
    }
}
