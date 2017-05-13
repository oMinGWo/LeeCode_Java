package question;

public class No066 {
	public int[] plusOne(int[] digits) {
		if(digits.length==0 || digits==null){
			return null;
		}
		int len=digits.length;
		int[] result=new int[len];
        boolean AllNine=true;
        for(int i:digits)
        	if(i!=9)
        		AllNine=false;
        if(AllNine){
        	int[] r=new int[len+1];
        	r[0]=1;
        	for(int i=1;i<r.length;i++)
        		r[i]=0;
        	return r;
        }
        int in=0;
        if(digits[len-1]+1>9){
        	in=1;
        	result[len-1]=0;
        }else{
        	in=0;
        	result[len-1]=digits[len-1]+1;
        }
        
        for(int i=result.length-2;i>=0;i--){
        	int t=in+digits[i];
        	if(t>9){
        		result[i]=0;
        		in=1;
        	}else{
        		result[i]=t;
        		in=0;
        	}
        }
        return result;
    }
}
