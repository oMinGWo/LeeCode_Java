package question;

import java.util.Arrays;

public class No389 {
	public char findTheDifference(String s, String t) {
		char[] x=s.toCharArray();
		char[] y=t.toCharArray();
		Arrays.sort(x);
		Arrays.sort(y);
		int len1=x.length;
		int len2=y.length;
		int len=len1<len2?len1:len2;
		for(int i=0;i<len;i++){
			if(x[i]!=y[i])
				if(len1<len2) return y[i];
				else return x[i];
		}
		if(len1<len2) return y[len2-1];
		else return x[len1-1];
	}
}
