package question;

public class No326 {
	public boolean isPowerOfThree(int n) {
		if(n<=0){
            return false;
        }
        while(true){
			if(n==1){
				return true;
			}
			if(n%3!=0){
				return false;
			}else{
				n=n/3;
			}
		}
    }
}
