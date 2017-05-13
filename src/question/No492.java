package question;

public class No492 {
	public int[] constructRectangle(int area) {
		int[] re=new int[2];
		int start=(int) Math.ceil(Math.sqrt(area));
		for(int i=start;i<=area;++i){
			if(area%i==0){
				re[0]=i;
				re[1]=area/i;
				return re;
			}
		}
		return re;
	}
}
