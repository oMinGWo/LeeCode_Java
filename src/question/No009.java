package question;

public class No009 {
	public static void main(String args[]){
		No009 n=new No009();
		System.out.println(n.isPalindrome(12222331));
	}
	public boolean isPalindrome(int x) {
		String s=""+x;
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1)){
				return false;
			}
		}
        return true;
    }
}
