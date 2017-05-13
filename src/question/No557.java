package question;

/**
 * Created by HenryLee on 2017/5/3.
 */
public class No557 {
    public String reverseWords(String s) {
        String re="";
        String[] words=s.split(" ");
        for(String word:words){
            StringBuilder t=new StringBuilder(word);
            re+=t.reverse().toString()+" ";
        }
        re=re.substring(0,re.lastIndexOf(" "));
        return re;
    }
}
