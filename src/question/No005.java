package question;

public class No005 {
	public static void main(String args[]) {
		No005 n = new No005();
		System.out.println(n.longestPalindrome("a"));
	}

	public String longestPalindrome(String s) {
		if (s.length() == 0) {
			return "";
		}
		StringBuilder ss = new StringBuilder();
		ss.append('#');
		for (int i = 0; i < s.length(); i++) {
			ss.append(s.charAt(i));
			ss.append('#');
		}

		String newStr = ss.toString();

		// rad[i]��ʾ��iΪ���ĵĻ��ĵ����뾶��i����Ϊ1�������ַ�����
		int[] rad = new int[newStr.length()];
		// right��ʾ��֪�Ļ����У����ҵı߽������
		int right = -1;
		// id��ʾ��֪�Ļ����У�ӵ�����ұ߽�Ļ��ĵ��е�����
		int id = -1;
		// 2.�������е�rad
		// ����㷨��O(n)�ģ���Ϊrightֻ���������while�ĵ�����������������١�
		int max = 0;
		int index = 0;
		for (int i = 0; i < newStr.length(); i++) {
			// 2.1.ȷ��һ����С�İ뾶
			int r = 1;
			if (i <= right) {
				r = Math.min(rad[id] - i + id, rad[2 * id - i]);
			}
			// 2.2.���Ը���İ뾶
			while (i - r >= 0 && i + r < newStr.length()
					&& newStr.charAt(i - r) == newStr.charAt(i + r)) {
				r++;
			}
			// 2.3.���±߽�ͻ�����������
			if (i + r - 1 > right) {
				right = i + r - 1;
				id = i;
			}
			rad[i] = r;
			if (r > max) {
				max = r;
				index = (i - 1) / 2;
			}
		}

		System.out.println(index + "   " + max);

		max = max - 1;
		if (max % 2 == 1) {
			return s.substring(index - max / 2, index + max / 2 + 1);
		} else {
			return s.substring(index - max / 2 + 1, index + max / 2 + 1);
		}
	}
}
