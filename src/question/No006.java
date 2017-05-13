package question;

public class No006 {
	public String convert(String s, int numRows) {
		if (numRows == 1) {
			return s;
		}
		if (s.length() <= numRows) {
			return s;
		}
		int line = (s.length() / (numRows * 2 - 2) + 1) * numRows;

		int tt = numRows - 1;
		String[][] data = new String[numRows][line];
		System.out.println(line);
		int index = 0;
		for (int i = 0; i < line / (numRows * 2 - 2) + 1; i++) {
			for (int j = 0; j < numRows; j++) {
				if (index < s.length()) {
					System.out
							.println(j + " " + i * tt + ":" + s.charAt(index));
					data[j][i * tt] = s.charAt(index) + "";
					index++;
				}
			}
			System.out.println("========");
			for (int j = numRows - 2; j > 0; j--) {
				for (int k = 1; k < numRows - 1; k++) {
					if (index < s.length()) {
						int l = i * tt + k;
						System.out.println(j + " " + l + ":" + s.charAt(index));
						data[j][i * tt + k] = s.charAt(index) + "";
						index++;
						break;
					}
				}
			}
		}
		String result = "";
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < line; j++) {
				if (data[i][j] != null) {
					result += data[i][j];
				}
			}
		}
		return result;
	}

	public static void main(String args[]) {
		No006 n = new No006();
		System.out.println(n.convert("abcdef", 4));
	}
}
