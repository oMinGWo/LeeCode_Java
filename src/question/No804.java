package question;

import java.util.ArrayList;
import java.util.List;

public class No804 {
    String[] code ={".-","-...","-.-.","-..",
            ".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.",
            "---",".--.","--.-",".-.","...",
            "-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        List<String> xx = new ArrayList<String>();
        for (String word:words){
            String codeStr = getCodeStr(word);
            if (!xx.contains(codeStr)){
                xx.add(codeStr);
            }

        }
        return xx.size();
    }

    private String getCodeStr(String word){
        char[] w = word.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c:w){
            stringBuilder.append(code[c-97]);
        }
        return stringBuilder.toString();
    }
}
