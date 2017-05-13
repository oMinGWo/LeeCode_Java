package question;

public class No374 {
	int x=78;
	public static void main(String args[]){
		No374 n=new No374();
		System.out.println(n.guessNumber(1234));
	}
	public int guessNumber(int n) {
        return guessN(1,n);
    }
	
	public int guessN(int a,int b){
		int middle=(a+b)/2;
		System.out.println("**"+middle);
		int re=guess(middle);
		if(re==0) return middle;
		if(re==-1) return guessN(middle,b);
		else return guessN(a,middle);
	}
	
	public int guess(int a){
		if(a<x) return -1;
		if(a>x) return 1;
		return 0;
	}
}
