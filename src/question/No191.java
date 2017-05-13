package question;

public class No191 {
	public static void main(String args[]){
		No191 n=new No191();
		System.out.println(n.hammingWeight(2));
	}

	public int hammingWeight(int n) {
		int re=0;
		while(n!=0){
			n=n&(n-1);
			re++;
		}
		return re;
    }
}
