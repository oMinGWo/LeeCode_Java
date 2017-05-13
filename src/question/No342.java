package question;

public class No342 {
	public boolean isPowerOfFour(int num) {
		if(num<=0) return false;
        
        while(num>3){
        	int t=num%4;
        	if(t==0){
        		num=num/4;
        		continue;
        	}else{
        		return false;
        	}
        }
		return num==1;
    }
}
