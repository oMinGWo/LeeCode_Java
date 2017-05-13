package question;

public class No299 {
	public String getHint(String secret, String guess) {
        int bull=0;
        int cow=0;
        int num[]=new int[10];
        for(int i=0;i<secret.length();i++){
        	if(secret.charAt(i)==guess.charAt(i))
        		bull++;
        	else{
        		num[secret.charAt(i)-'0']++;
        		if(num[secret.charAt(i)-'0']<=0)
        			cow++;
        		num[guess.charAt(i)-'0']--;
        		if(num[guess.charAt(i)-'0']>=0)
        			cow++;
        	}
        }
        
		return bull+"A"+cow+"B";
    }
}
