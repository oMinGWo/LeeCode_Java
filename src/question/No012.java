package question;

public class No012 {

	public static void main(String[] args) {
		No012 n=new No012();
		System.out.println(n.intToRoman(1996));

	}
	public String intToRoman(int num) {
        int[] n={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] m={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String result="";
        for(int i=0;i<n.length;i++){
        	while(num>=n[i]){
        		num-=n[i];
        		result+=m[i];
        	}
        }
        return result;
    }
}
