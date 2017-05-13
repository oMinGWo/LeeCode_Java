package question;

import java.util.HashMap;

public class No202 {
	HashMap<Integer,Integer> h=new HashMap();
	public static void main(String args[]){
		No202 n=new No202();
		System.out.println(n.isHappy(49));
	}
	public boolean isHappy(int n) {
		System.out.println(n);
		if(n==1) return true;
		h.put(n,1);
		int m=n;
		int len=1;
		while(m>=10){
			len++;
			m/=10;
		}
		int sum=0;
		for(int i=0;i<len;i++){
			sum+=(n%10)*(n%10);
			n=n/10;
		}
		if(sum==n || h.containsKey(sum)) return false;
        return isHappy(sum);
    }
	
}
