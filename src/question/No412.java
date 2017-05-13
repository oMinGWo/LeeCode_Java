package question;

import java.util.ArrayList;
import java.util.List;

public class No412 {
	public List<String> fizzBuzz(int n) {
        List<String> re=new ArrayList<String>();
        for(int i=1;i<n+1;++i){
        	if(help1(i) && !help2(i)){
        		re.add("Fizz");
        	}else if(!help1(i) && help2(i)){
        		re.add("Buzz");
        	}else if(help1(i) && help2(i)){
        		re.add("FizzBuzz");
        	}else {
        		re.add(i+"");
        	}
        }
		return re;
    }
	
	public boolean help1(int x){
		if(x%3==0)
			return true;
		return false;
	}
	
	public boolean help2(int x){
		if(x%5==0)
			return true;
		return false;
	}
}
