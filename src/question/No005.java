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

		// rad[i]表示以i为中心的回文的最大半径，i至少为1，即该字符本身
		int[] rad = new int[newStr.length()];
		// right表示已知的回文中，最右的边界的坐标
		int right = -1;
		// id表示已知的回文中，拥有最右边界的回文的中点坐标
		int id = -1;
		// 2.计算所有的rad
		// 这个算法是O(n)的，因为right只会随着里层while的迭代而增长，不会减少。
		int max = 0;
		int index = 0;
		for (int i = 0; i < newStr.length(); i++) {
			// 2.1.确定一个最小的半径
			int r = 1;
			if (i <= right) {
				r = Math.min(rad[id] - i + id, rad[2 * id - i]);
			}
			// 2.2.尝试更大的半径
			while (i - r >= 0 && i + r < newStr.length()
					&& newStr.charAt(i - r) == newStr.charAt(i + r)) {
				r++;
			}
			// 2.3.更新边界和回文中心坐标
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
