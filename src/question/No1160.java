package question;

public class No1160 {
    public int countCharacters(String[] words, String chars) {
        if (words.length == 0 || chars.length() == 0){
            return 0;
        }
        int result = 0;
        for (String word: words){
            if (word.length() > chars.length()){
                continue;
            }
            boolean[] used = new boolean[chars.length()];
            boolean isOk = true;
            for (Character c: word.toCharArray()){
                boolean found = false;
                for (int i=0;i<chars.length();++i){
                    if (used[i]){
                        continue;
                    }
                    if (c == chars.charAt(i)){
                        used[i] = true;
                        found = true;
                        break;
                    }
                }
                if (!found){
                    isOk = false;
                }
            }
            if (isOk){
                result += word.length();
            }
        }
        return result;
    }
}
