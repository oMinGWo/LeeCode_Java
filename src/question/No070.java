package question;

public class No070 {
	public static void main(String args[]){
		No070 n=new No070();
		System.out.println(n.climbStairs(44));
	}
	public int climbStairs(int n) {
		int a=0;
		int b=1;
		int sum=0;
		for(int i=0;i<=n;i++){
			sum=a+b;
			a=b;
			b=sum;
		}
		return sum;
    }
}
