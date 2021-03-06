package question;

public class No318 {
	public int maxProduct(String[] words) {
		if (words == null || words.length <= 1) {
            return 0;
        }
        // Pre-processing
        int[] processedWords = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            processedWords[i] = 0;
            for (int j = 0; j < words[i].length(); j++) {
                processedWords[i] |= (1 << words[i].charAt(j) - 'a');
            }
        }
        // get result
        int maxProduct = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (((processedWords[i] & processedWords[j]) == 0)
                        && words[i].length() * words[j].length() > maxProduct) {
                    maxProduct = words[i].length() * words[j].length();
                }
            }
        }

        return maxProduct;
    }
}
