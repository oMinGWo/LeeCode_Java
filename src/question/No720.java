package question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class No720 {
    public String longestWord(String[] words) {
        HashSet<String> set = new HashSet<>(Arrays.asList(words));
        List<String> list = Arrays.stream(words).sorted((s1, s2)->(s2.length()-s1.length())).collect(Collectors.toList());
        String longest = "";
        for (int i=0;i<list.size();++i){
            String word = list.get(i);
            if (word.length() < longest.length()){
                break;
            }
            boolean isOk = true;
            for (int j=0;j<word.length();++j){
                String checkWord = word.substring(0,word.length()-j);
                if (!set.contains(checkWord)){
                    isOk = false;
                    break;
                }
            }
            if (isOk){
                if (word.length() > longest.length()){
                    longest = word;
                }else if (word.length()==longest.length()){
                    longest = word.compareTo(longest)>0?longest:word;
                }
            }
        }
        return longest;
    }
}
