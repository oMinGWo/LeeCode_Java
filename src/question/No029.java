package question;

public class No029 {
	//TODO
    public int divide(int dividend, int divisor) {
        if(divisor==0){
        	return Integer.MAX_VALUE;
        }else if(dividend==0){
        	return 0;
        }
        boolean isNegative=dividend*divisor>0?false:true;
        long a=Math.abs(dividend);
        long b=Math.abs(divisor);
        int result=0;
        int count=0;
        while(a>=b){
        	count=1;
        	b=Math.abs(divisor);
        	long sum=b;
        	while(sum+sum<=a){
        		sum=sum+sum;
        		count=count+count;
        	}
        	a=a-sum;
        	result+=count;
        }
        return isNegative?0-result:result;
    }
}
