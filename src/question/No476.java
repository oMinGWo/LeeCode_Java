package question;

public class No476 {
	public int findComplement(int num) {
        String re=Integer.toBinaryString(num);
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<re.length();++i){
        	if(re.charAt(i)=='0') 
        		sb.append("1");
        	else 
        		sb.append("0");
        }
        System.out.println(sb.toString());
        int x=Integer.parseInt(sb.toString(),2);
		return x;
    }
}
