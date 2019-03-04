package question;

import java.util.Arrays;

public class No121 {
	public int maxProfit(int[] prices) {
		if (prices==null || prices.length==0){
			return 0;
		}
		int min = Integer.MAX_VALUE;
		boolean haveMin = false;
		int max = 0;
		for (int i=0;i<prices.length;++i){
			if (prices[i] < min){
				min = prices[i];
				haveMin = true;
				continue;
			}
			if (haveMin && prices[i] > min){
				int x = prices[i] - min;
				max = Math.max(max, x);
			}
		}
		return max;
	}
}
