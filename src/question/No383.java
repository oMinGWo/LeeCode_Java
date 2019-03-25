package question;

import java.util.Arrays;

public class No383 {
	public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.equals("")) {
			return true;
		}
        if(magazine.length()<ransomNote.length()) {
			return false;
		}
		char[] x=ransomNote.toCharArray();
		char[] y=magazine.toCharArray();
		for(char i:x){
			int key=0;
			for(int j=0;j<y.length;j++){
				if(i==y[j]){
					y[j]=0;
					key=1;
					break;
				}
			}
			if(key==0) {
				return false;
			}
		}
		return true;
    }
}
