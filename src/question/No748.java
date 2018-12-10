package question;

public class No748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        String result = "";
        for (String word : words) {
            String wordBack = new String(word);
            boolean is = true;
            for (char c : licensePlate.toCharArray()) {
                if (c >= 48 && c<=57 || c == ' ') {
                    continue;
                }
                if (word.contains(c + "")) {
                    is = true;
                    int index = word.indexOf(c);
                    word = word.substring(0,index) + word.substring(index+1);
                }else {
                    is = false;
                    break;
                }
            }
            if (is) {
                if (result.equals("")) {
                    result = wordBack;
                } else if (wordBack.length() < result.length()) {
                    result = wordBack;
                }
            }
        }
        return result;
    }
}
