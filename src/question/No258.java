package question;

public class No258 {
	
	public static void main(String args[]){
		No258 n=new No258();
		int x=n.addDigits(1234);
		System.out.println(x);
	}

	
	public int addDigits(int num) {
        return help(num+"");
    }
    public int help(String s){
        if(s.length()==1)
            return Integer.parseInt(s);
        char[] a=s.toCharArray();
        int sum=0;
        for(int i=0;i<a.length;i++){
        	sum+=a[i]-'0';
        }
        return help(sum+"");
    }
}
