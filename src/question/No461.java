package question;

public class No461 {
	public int hammingDistance(int x, int y) {
		String xx=new StringBuffer(Integer.toBinaryString(x)).reverse().toString();
		String yy=new StringBuffer(Integer.toBinaryString(y)).reverse().toString();
        int l1=xx.length();
        int l2=yy.length();
		if(l1<l2){
			for(int i=0;i<l2-l1;++i){
				xx+="0";
			}
		}else{
			for(int i=0;i<l1-l2;++i){
				yy+="0";
			}
		}
		int re=0;
		for(int i=0;i<xx.length();++i){
			if(xx.charAt(i)!=yy.charAt(i))
				re++;
		}
		return re;
    }
}
