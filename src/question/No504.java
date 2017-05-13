package question;

public class No504 {
	public String convertToBase7(int num) {
		boolean isNegative=false;
		if(num<0){
			isNegative=true;
			num=-num;
		}
		String re="";
		while(true){
			if(num<7)
				break;
			String t=num%7+"";
			re=t+re;
			num=num/7;
		}
		re=num+re;
		if(isNegative)
			return "-"+re;
		return re;
    }
}
