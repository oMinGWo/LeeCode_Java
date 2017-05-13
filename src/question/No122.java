package question;

public class No122 {
	public int maxProfit(int[] prices) {
        int re=0;
        for(int i=0;i<prices.length-1;i++){
        	if(prices[i]<prices[i+1]) re+=prices[i+1]-prices[i];
        }
        return re;
    }
}
