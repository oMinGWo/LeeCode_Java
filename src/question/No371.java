package question;

public class No371 {
	public int getSum(int a, int b) {
		int result = a ^ b; // ��λ��
        int carray = (a & b) << 1; // �����λ
        if(carray!=0) return  getSum(result,carray); //�жϽ�λ�봦��
        return result;
    }
}
