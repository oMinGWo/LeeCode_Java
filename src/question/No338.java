package question;

public class No338 {
	public int[] countBits(int num) {
        int[] result=new int[num+1];
        result[0]=0;
        for(int i=0;i<=num;i++){
        	result[i]=count(i);
        }
        return result;
    }
	//����a��������1�ĸ���
	//http://www.cnblogs.com/graphics/archive/2010/06/21/1752421.html
	public int count(int a){
		int c=0;
		for(c=0;a>0;c++){
			a=a&(a-1);
		}
		return c;
	}
}
