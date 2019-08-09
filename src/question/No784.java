package question;


import java.util.ArrayList;
import java.util.List;

public class No784 {
    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        help(S.toCharArray(),0, S.length(), result,new StringBuilder());
        return result;
    }

    private void help(char[] chars, int start, int depth, List<String> result, StringBuilder curr){
        if (depth == curr.length()){
            result.add(curr.toString());
            return;
        }
        for (int i=start;i<chars.length;++i) {
            if (!(chars[i] >= '0' && chars[i] <='9')){
                curr.append(change(chars[i]));
                help(chars, i+1,depth,result,curr);
                curr.deleteCharAt(curr.length()-1);
            }
            curr.append(chars[i]);
            help(chars, i+1,depth,result,curr);
            curr.deleteCharAt(curr.length()-1);

        }
    }

    private char change(char c){
        if (c >= 'A' && c <= 'Z'){
            return (char) (c + 32);
        }else {
            return (char)(c - 32);
        }
    }
}
