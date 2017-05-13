package question;

public class No010 {

	public static void main(String[] args) {
		No010 n = new No010();
		System.out.println(n.isMatch("", ""));
	}

	public boolean isMatch(String s, String p) {
		return isM(s, p, 0, 0);
	}

	// i j ��ʾ Ŀǰ��鵽s��iλ��p��jλ
	private boolean isM(String s, String p, int i, int j) {
		if (j >= p.length()) { // j>p.length() p�Ѿ�����
			return i >= s.length(); // ���s��û���� �ǿ϶�false
		}
		if (j == p.length() - 1) { // ��p��鵽���һ��charʱ��
			// sҲҪ�����һ��char����ƥ����p
			return (i == s.length() - 1)
					&& (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
		}
		// ���pattern��һ���ַ�j+1����*
		if (j + 1 < p.length() && p.charAt(j + 1) != '*') {
			if (i == s.length()) { // ������Ѿ�����,��˵����ƥ�䡣
				return false;
			}
			if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') { // ��һ��ƥ������
				return isM(s, p, i + 1, j + 1); // ������һ���ַ��ж�
			} else { // ��ǰs�� ��ƥ��
				return false;
			}
		}
		// �����if(&p.charAt(j+1)!='*') �Ѿ���p ����j+1��*��ʱ����˵���
		// ��ʱ pattern����һ���ַ�j+1��*
		while (i < s.length() && j < p.length()
				&& (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')) {
			// ��Ϊ ��ʱjƥ������ j+1��* ���� ֱ��iλ�� j+2 λ����ı�
			// Ȼ�� whileֱ��i+1λ�� j+2 λ����ı� i+2 i+3.... �� һ��match�Ͼ�return true
			// Ϊʲô����ֱ����i+1λ����iλ�أ�
			// �ȷ�˵ aabc ȥmatch a*aabc ��ô�� aa��a* match�ϵ�ʱ�� ���ֱ����abcȥmatch aabc
			// �ǲ�����ȫƥ��� ����Ҫ��ÿһ�ֿ�����
			// ����Ҫ̽��ÿһ�ֿ����� ��i��ʼ ������i+1
			if (isM(s, p, i, j + 2)) {
				return true;
			}
			i++;
		}
		// �����һ���ַ�(j+1)��* �� ��ǰ�ַ���ƥ�䣬�Ͳ���while�� ��pattern�����������ͺñ� c*a*b ����c*���������Ƚ�
		// ����
		// ����һ���������������������һ�γ��ԣ�i==s.length()��
		return isM(s, p, i, j + 2);

	}

}
