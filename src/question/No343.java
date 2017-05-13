package question;

public class No343 {
	public int integerBreak(int n) {
		if(n==2) return 1;
		if(n==3) return 2;
		int re=1;
		while(n>4){
			re*=3;
			n-=3;
		}
		return re*n;
	}
}
