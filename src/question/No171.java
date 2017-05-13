package question;

public class No171 {
	public static void main(String args[]){
		No171 n=new No171();
		System.out.println(n.titleToNumber("aa"));
	}
	
	public int titleToNumber(String s) {
		s=s.toUpperCase();
		int len=s.length();
		int result=0;
		for(int i=0;i<len;i++){
			result+=(s.charAt(len-i-1)-'@')*Math.pow(26,i);
		}
        return result;
    }
}
