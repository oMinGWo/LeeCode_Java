package question;

public class No010 {

	public static void main(String[] args) {
		No010 n = new No010();
		System.out.println(n.isMatch("", ""));
	}

	public boolean isMatch(String s, String p) {
		return isM(s, p, 0, 0);
	}

	// i j 表示 目前检查到s的i位和p的j位
	private boolean isM(String s, String p, int i, int j) {
		if (j >= p.length()) { // j>p.length() p已经走完
			return i >= s.length(); // 如果s还没走完 那肯定false
		}
		if (j == p.length() - 1) { // 当p检查到最后一个char时候
			// s也要是最后一个char且能匹配上p
			return (i == s.length() - 1)
					&& (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
		}
		// 如果pattern下一个字符j+1不是*
		if (j + 1 < p.length() && p.charAt(j + 1) != '*') {
			if (i == s.length()) { // 如果是已经走完,则说明不匹配。
				return false;
			}
			if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') { // 这一格匹配上了
				return isM(s, p, i + 1, j + 1); // 继续下一个字符判断
			} else { // 当前s和 不匹配
				return false;
			}
		}
		// 上面的if(&p.charAt(j+1)!='*') 已经把p 里面j+1是*的时候给滤掉了
		// 此时 pattern的下一个字符j+1是*
		while (i < s.length() && j < p.length()
				&& (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')) {
			// 因为 此时j匹配上了 j+1是* 所以 直接i位和 j+2 位后面的比
			// 然后 while直接i+1位和 j+2 位后面的比 i+2 i+3.... 有 一个match上就return true
			// 为什么不是直接上i+1位而是i位呢？
			// 比方说 aabc 去match a*aabc 那么当 aa和a* match上的时候 如果直接让abc去match aabc
			// 是不能完全匹配的 所以要留每一种可能性
			// 所以要探测每一种可能性 从i开始 而不是i+1
			if (isM(s, p, i, j + 2)) {
				return true;
			}
			i++;
		}
		// 如果下一个字符(j+1)是* 且 当前字符不匹配，就不进while块 则pattern跳过两个（就好比 c*a*b 跳过c*），继续比较
		// 后面
		// 还有一种情况到这里是上面的最后一次尝试（i==s.length()）
		return isM(s, p, i, j + 2);

	}

}
