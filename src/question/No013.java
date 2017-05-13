package question;

public class No013 {

	public static void main(String[] args) {
		No013 n = new No013();
		System.out.println(n.romanToInt("MCMXCVI"));

	}

	public int romanToInt(String s) {
		int result = 0;
		char[] array = s.toCharArray();
		for (int i = 0; i < array.length; i++) {
			
			if (i > 0 && getChar(array[i]) > getChar(array[i - 1])) {
				result = result
						+ (getChar(array[i]) - 2 * getChar(array[i - 1]));
			} else {
				result = result + getChar(array[i]);
			}
		}

		return result;
	}

	public int getChar(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;

	}
}
