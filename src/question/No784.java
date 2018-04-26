package question;


import java.util.ArrayList;
import java.util.List;

public class No784 {
    public List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<String>();
        if (S == null || S.length()==0){
            list.add("");
            return list;
        }
        List<String> results = letterCasePermutation(S.substring(1));
        for (String result:results){
            if(Character.isLetter(S.charAt(0))){
                list.add(S.substring(0,1).toLowerCase() + result);
                list.add(S.substring(0,1).toUpperCase() + result);
            }else{
                list.add(S.substring(0,1) + result);
            }
        }
        return list;
    }
}
