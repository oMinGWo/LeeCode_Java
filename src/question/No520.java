package question;

public class No520 {
	public boolean detectCapitalUse(String word) {
        char x[] = word.toCharArray();
        if(word.equals(word.toUpperCase())) return true;
		if(word.equals(word.toLowerCase())) return true;
		if(x[0]>=65&&x[0]<=90){
			String t=word.substring(1);
			if(t.equals(t.toUpperCase())) return true;
			if(t.equals(t.toLowerCase())) return true;
		}
		return false;
    }
}
