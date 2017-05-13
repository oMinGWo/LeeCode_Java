package question;

public class No204 {
	public int countPrimes(int n) {
        if(n<=2) return 0;
        int re=0;
        boolean[] a=new boolean[n];
        for(int i=2;i<n;i++){
        	if(!isPrime(i)){
        		a[i]=true;
        		for(int j=2;j*i<n;j++){
        			a[i*j]=true;
        		}
        	}
        }
        for(int i=2;i<n;i++){
        	if(!a[i]) re++;
        }
		return re;
    }
	public boolean isPrime(int n){
		for(int i=2;i<Math.sqrt(n);i++){
			if(n%i==0) return false;
		}
		return true;
	}
}
