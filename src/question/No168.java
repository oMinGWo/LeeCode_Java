package question;

public class No168 {
	public String convertToTitle(int n) {
        String re="";
        while(n>0){
        	char x=(char) ((n-1)%26+'A');
        	re=x+re;
        	n=(n-1)/26;
        }
		return re;
    }
}
