package question;

public class No357 {
	//reference:http://www.cnblogs.com/grandyang/p/5582633.html
	 public int countNumbersWithUniqueDigits(int n) {
		 if(n==0) return 1;
		 int re=0;
		 for(int i=1;i<=n;i++){
			 re+=count(i);
		 }
		 return re;
	 }
	 
	 public int count(int a){
		 if(a<1) return 0;
		 if(a==1) return 10;
		 int re=1;
		 for(int i=9;i>=(11-a);i--)
			 re*=i;
		 return re*9;
	 }
}
