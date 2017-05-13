package question;

import java.util.Arrays;

public class No121 {
	public int maxProfit(int[] prices) {
		if(prices==null || prices.length==0) return 0;
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
		for(int i=0;i<prices.length;i++){
			if(prices[i]<min){
				min=prices[i];
				continue;
			}
			if(prices[i]-min>maxProfit){
				maxProfit=prices[i]-min;
			}
		}
		
		return maxProfit;
	}
}
