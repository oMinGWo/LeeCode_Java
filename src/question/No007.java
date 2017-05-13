package question;

public class No007 {
	public static void main(String args[]) {
		No007 n = new No007();
		System.out.println(n.reverse(1534236469));
	}

	public int reverse(int x) {
		String s = x + "";
		String ss = "";
		int re = 0;
		if (s.charAt(0) == '-') {
			s = s.substring(1);
			ss = new StringBuilder(s).reverse().toString();
			try {
				re = Integer.parseInt(ss);
			} catch (Exception e) {
				return 0;
			}
			return re;
		} else {
			ss = new StringBuilder(s).reverse().toString();
			try {
				re = Integer.parseInt(ss);
			} catch (Exception e) {
				return 0;
			}
			return re;
		}

	}
}
